package dev.lpa;

import java.util.ArrayList;
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
    }
}
