
/*
creating a grocery list with a record, and constructor
 */
package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

//creating a record
record GroceryItem(String name, String type, int count) {
    //creating a constructor
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}
public class Main {

    public static void main(String[] args) {

        //create an array of objects
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray[2] = "5 Oranges";
        System.out.println(Arrays.deepToString(groceryArray));


        GroceryItem[] groceryArray2 = new GroceryItem[3];
        groceryArray2[0] = new GroceryItem("Milk");
        groceryArray2[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray2[2] = new GroceryItem("Oranges", "PRODUCE", 5);
        System.out.println(Arrays.deepToString(groceryArray2));


        //creating grocery List with the ArrayList
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");


        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        System.out.println(groceryList);
    }
}
