package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie","delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }

        //alternatively to for loop
        System.out.println("---------");
        //using lambda expressions
        list.forEach((var myString) -> System.out.println(myString));

        //to use multiple statements
        System.out.println("---------");
        String prefix = "nato"; //its final. you cannot change it
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });

        System.out.println("------");

        int result = calculator((var a, var b) -> {var c = a + b; return c;}, 5, 2);
        var result2 = calculator((a, b) -> a/b, 10.0, 2.5);
        var result3 = calculator(
                (a,b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden"
        );

    }

    //public static method with three arguments, instance of interface Operations and two values
    public static <T> T calculator(Operation<T> functions, T value1, T value2){

        T result = functions.operate(value1,value2);
        System.out.println("Result of operation: " + result);
        return result;

    }


}
