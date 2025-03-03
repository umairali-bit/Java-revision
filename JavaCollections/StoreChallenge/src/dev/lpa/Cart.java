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
}















