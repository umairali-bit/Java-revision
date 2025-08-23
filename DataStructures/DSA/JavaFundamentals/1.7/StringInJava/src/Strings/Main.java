package Strings;

public class Main {

    public static void main(String[] args) {

        //declaring a String
        String name = "Walter White"; //String literal

        String nameA = new String("Walter White");

        /*
        Memory - Stack and Heap
        Stack - references
        Heap - String Constant Pool - Object

        Stack - name (reference)
        name (reference) -> heap -> String Constant Pool -> Walter White

        Stack - nameA (reference)
        nameA -> heap -> (without String Constant Pool) -> Walter White
         */

    }
}
