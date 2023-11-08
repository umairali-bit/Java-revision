package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        //creating a String array with 4 elements
        String[] items = {"Apples","Oranges","Bananas","Avocado"};

        //creating list of Items
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());//to see the type of the class
       // list.add("Strawberries");//gives an error because Array is immutable

        //to mutate the list
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Strawberries");
        System.out.println(groceries);


        /*
        The List is an interface, and the ArrayList is a class of Java Collection framework.
        The List creates a static array, and the ArrayList creates a dynamic array for storing the objects.
        So the List can not be expanded once it is created but using the ArrayList, we can expand the array when needed.
         */


        //create a new list and pass more groceries to the groceries list
        ArrayList<String> nextList = new ArrayList<>(
                List.of("Pickles","Cheese","Almonds"));
        groceries.addAll(nextList);
        System.out.println(nextList);
        System.out.println(groceries);

        System.out.println();
        System.out.println("-".repeat(15)+"ArrayList Part 3"+"-".repeat(15));

        //to get an element from an ArrayList
        System.out.println("Third element = " +groceries.get(2));

        // to search for an element is an ArrayList
        //contains() return a boolean if the item exists

        if(groceries.contains("bananas")){
            System.out.println("List contains Bananas");
        }

        //use of indexOf() and lastIndexOf()
        System.out.println(groceries);
        groceries.add("yogurt");
        System.out.println("first = " +groceries.indexOf("yogurt"));
        System.out.println("last = " +groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);


        //remove multiple elements from a list
        groceries.removeAll(List.of("Apples","Bananas"));
        System.out.println(groceries);

        //retainAll() is used to keep elements in the list and delete the rest
        groceries.retainAll(List.of("Avocado","Strawberries"));
        System.out.println(groceries);

        //to remove all the elements in the ArrayList
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());//to check if the arrayList is empty

        //to add elements through factory method
        groceries.addAll(List.of("apples","mustard","turkey"));
        groceries.addAll(Arrays.asList("eggs", "chicken","drinks"));
        System.out.println(groceries);

        //sort through the list
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        //reverse order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //getting a list from an array, with a different method on ArrayList
        var groceriesArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceriesArray));

    }
}
