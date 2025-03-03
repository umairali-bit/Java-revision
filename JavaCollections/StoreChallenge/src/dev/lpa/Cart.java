package dev.lpa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    enum CartType {PHYSICAL, VIRTUAL};

    private static int lastId = 1; //cart number
    private int id;
    private LocalDate cartDate;
    private CartType type;
    private Map<String, Integer> products; //string will be product sku, Integer will be the quantity ordered

    public Cart(CartType type, int days) { //days to set up some test data which will test the abandon cart code
        this.type = type;
        id = lastId++;
        cartDate = LocalDate.now().minusDays(days);
        products = new HashMap<>();
    }

    public Cart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCartDate(LocalDate cartDate) {
        this.cartDate = cartDate;
    }

    public void addItem (InventoryItem item, int qty) {

        /*This code, if the items in the map, will add qty to the current qty, but if its not in the map,it will
        insert a new entry using the qty
         */
        products.merge(item.getProduct().sku(),qty,Integer::sum);

        if(!item.reservedItem(qty)) {
            System.out.println("Ouch, something went wrong, could not add item");
        }

    }

    public void removeItem(InventoryItem item, int qty) {

        //this code works if the quantity in the cart, is less than or equal to the qty passed

        int current = products.get(item.getProduct().sku());
        if (current <= qty) {
            qty = current;
            products.remove(item.getProduct().sku());
            System.out.printf("Item [%s] removed from the basket%n", item.getProduct().name());

            /*
            if a shopper had 5 apples, he might want to put back 2, for some reason,
            this requires an else statement and a merge.
            Instead of adding the values, oldVal is subtracted from newVal
            and then print out how many of the products were removed
             */

        } else {
            products.merge(item.getProduct().sku(),qty, (oldVal, newVal) -> oldVal - newVal);
            System.out.printf("%d [%s]s removed%n", qty, item.getProduct().name());
        }
        item.releaseItem(qty);// changes the reserve amount with the qty from above
    }
}















