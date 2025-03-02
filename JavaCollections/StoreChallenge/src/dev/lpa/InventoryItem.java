package dev.lpa;

public class InventoryItem {

//private fields

    private Product product;
    private double price;
    private int qtyTotal;
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
}
