package dev.lpa;

import java.sql.SQLOutput;
import java.util.ArrayList;


// creating a record
record OrderItem(int qty, ProductForSale product){

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<ProductForSale>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JFK, produced in 1950"));
        storeProducts.add(new Furniture("Sofa", 1200,"Mahogany Desk"));

        //listProducts()

        //if listProducts is not static
        Store store = new Store();
        store.listProducts();


        //ordering
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 1,2);
        addItemOrder(order1, 0,1);
        printOrder(order1);


        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemOrder(order2,2,4);
        addItemOrder(order2, 0,1);
        printOrder(order2);



    }

    //public static void listProducts()
    public void listProducts(){

        for(var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }


    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){


        double salesTotal = 0;
        for (var item: order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }




}
