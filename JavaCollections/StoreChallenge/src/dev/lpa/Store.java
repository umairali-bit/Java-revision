package dev.lpa;

import java.util.*;

public class Store {


    private Map<String, InventoryItem> inventory;

    private NavigableSet<Cart> carts = new TreeSet<>(Comparator.comparing(Cart::getId));

    private Map<Category, Map<String, InventoryItem>> aisleInventory;

    public static void main(String[] args) {

    }
}
