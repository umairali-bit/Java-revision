/*
Create an interactive console program and give the user following menu options
0- to shut down
1- to add item(s)  list (comma delimited list)
2- to remove any item(s) (comma delimited list)
Enter a number or which action you want to do:

use the Scanner class, solicit a menu item, 0,1,2 and process them accordingly
 Your grocery list should be an ArrayList
 You should se methods on ArrayList , to add items, move items, heck if an item is ready in the list, and print a sorted
 list
 You should int the list, sorted alphabetically, after each operation.
 No duplicate items in the list

 */

package dev.lpa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag) {
            printActions();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                case 3 -> quit();
                default -> flag = false;

            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }
    private static void printActions(){

        String textBlock = """
                0- to shut down 
                1- to add item(s)  list (comma delimited list)
                2- to remove any item(s) (comma delimited list)
                Enter a number or which action you want to do:""";

        System.out.println(textBlock);

    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add Items(s) [separated by comma]:");
        String[] items = scanner.nextLine().split(",");//reads the data and split it on ","


        for(String i : items){
            String trimmed = i.trim(); //get rid of white spaces if user added any
            if(groceries.indexOf(trimmed)< 0){ //get rid of duplicates
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove Items(s) [separated by comma]:");
        String[] items = scanner.nextLine().split(",");//reads the data and split it on ","


        for(String i : items){
            String trimmed = i.trim(); //get rid of white spaces if user added any
                groceries.remove(trimmed);
            }
        }

        private static void quit(){
        System.out.println("Type zero to quit the program");
        }
    }

