
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

    //to have cleaner output
    @Override
    public String toString() {
        return String.format("%d %s in %s", count ,name.toUpperCase(),type);
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

        // notice the difference
        GroceryItem[] groceryArray2 = new GroceryItem[3];
        groceryArray2[0] = new GroceryItem("Milk");
        groceryArray2[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray2[2] = new GroceryItem("Oranges", "PRODUCE", 5);
        System.out.println(Arrays.deepToString(groceryArray2));


        //creating grocery List with the ArrayList
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        //notice the difference
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        System.out.println(groceryList);//it works without calling Arrays.toString or deep method.


        System.out.println();
        System.out.println("-".repeat(15)+"ArrayList Part 2"+"-".repeat(15));

        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges","PRODUCE",6));
        //if you want a certain item at a certain index
        groceryList.add(0,
                new GroceryItem("Apples","PRODUCE", 4));
        System.out.println(groceryList);



    }
}
