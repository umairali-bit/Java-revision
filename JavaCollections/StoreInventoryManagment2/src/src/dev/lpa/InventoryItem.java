package src.dev.lpa;

public class InventoryItem {

//private fields

    private Product product;
    private double price;
    private int qtyTotal; //inventory
    private int qtyReserved;
    private int qtyReorder; //this is the quantity reordered if a minimum threshold is reached.
    private int qtyLow; //this has to be reached to order more products.


    public InventoryItem(Product product, double price, int qtyTotal, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qtyTotal = qtyTotal;
        this.qtyLow = qtyLow;
        this.qtyReorder = qtyTotal; //this is the reorder amount.
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    //reservedItem will get called as an item gets added to the shopping cart
    public boolean reservedItem (int qty) { //qty is the number of the product the shopper added to the cart

        //to make sure that the qty being added doesnt take the inventory below zero
        //the qtyTotal, the inventory , minus the qtyReserved, in other people's carts, is still greater than the qty requested
        if ((qtyTotal - qtyReserved) >= qty) {
            qtyReserved += qty;// adding the qty to qtyReserved
            return true;
        }
        //if theres not enough inventory for the shopper to buy, return false
        return false;
    }



    /*
    releaseItem() will be called when a shopper removes an item from their cart

    this will also be called during the automated process of abandoning the carts, removing products from those carts
    and unreserving their quantity.
     */

    public void releaseItem (int qty) {
        qtyReserved -= qty;
    }


    //sellItem() will be called during the checkout process
    public boolean sellItem (int qty) {

        if (qtyTotal > qty) {
            qtyTotal -= qty;
            qtyReserved -= qty;
            if (qtyTotal <= qtyLow) {
                placeInventoryOrder();
            }
            return true;
        }
        return false;
    }

    private void placeInventoryOrder() {

        System.out.printf("Ordering qty %d : %s%n", qtyReorder, product);
    }

    @Override
    public String toString() {
        return "%s, $%.2f : [%04d,% 2d]".formatted(product, price, qtyTotal, qtyReserved);
    }
}
