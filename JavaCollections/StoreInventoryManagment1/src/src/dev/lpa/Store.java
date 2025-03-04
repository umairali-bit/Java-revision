package src.dev.lpa;

import java.util.*;

public class Store {

    private static Random random = new Random();

    private Map<String, InventoryItem> inventory;

    private NavigableSet<Cart> carts = new TreeSet<>(Comparator.comparing(Cart::getId));

    private Map<Category, Map<String, InventoryItem>> aisleInventory;



    public static void main(String[] args) {

        Store myStore = new Store();
        myStore.stockStore();
        myStore.listInventory();

        myStore.stockAisles();
        myStore.listProductsByCategory();



    }

    //setting up some products, which be stocked in the store an aisles
    private void stockStore () {

        //instantiating inventory field to a new HashMap
        inventory = new HashMap<>();

        //List of products
        List<Product> products = new ArrayList<>(List.of(
                new Product("A100","apple","local",Category.PRODUCE),
                new Product("B100","banana","local",Category.PRODUCE),
                new Product("P100","pear","local",Category.PRODUCE),
                new Product("L103","lemon","local",Category.PRODUCE),
                new Product("M201","milk","farm",Category.DAIRY),
                new Product("Y001","yogurt","farm",Category.DAIRY),
                new Product("C333","cheese","farm",Category.DAIRY),
                new Product("R777","rice chex","Nabisco",Category.CEREAL),
                new Product("G111","granola","Nat Valley",Category.CEREAL),
                new Product("BB11","ground beef","butcher",Category.MEAT),
                new Product("CC11","chicken","butcher",Category.MEAT),
                new Product("BC11","bacon","butcher",Category.MEAT),
                new Product("BC77","coke","coca cola",Category.BEVERAGE),
                new Product("BC88","coffee","value",Category.BEVERAGE),
                new Product("BC99","tea","herbal",Category.BEVERAGE)
        ));

        //setting up my inventory map

        products.forEach(p-> inventory.put(p.sku(), new InventoryItem(p,random.nextDouble(0,1.25),
                1000, 5)));
    }


    private void stockAisles() {

        aisleInventory = new EnumMap<>(Category.class);
        for (InventoryItem item : inventory.values()) {
            Category aisle = item.getProduct().category();

            Map<String, InventoryItem> productMap = aisleInventory.get(aisle);
            if (productMap == null) {
                productMap = new HashMap<>();
            }
            productMap.put(item.getProduct().name(), item);
            aisleInventory.putIfAbsent(aisle, productMap);
        }

    }


    private void listInventory() {

        System.out.println("-".repeat(50));
        inventory.values().forEach(System.out::println);
    }

    private void listProductsByCategory() {
        aisleInventory.keySet().forEach(k -> {
            System.out.println("-------\n" + k + "\n--------");
            aisleInventory.get(k).keySet().forEach(System.out::println);
        });

    }


}














