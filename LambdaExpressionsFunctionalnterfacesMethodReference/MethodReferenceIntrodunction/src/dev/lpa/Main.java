package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {


        //list of names
        List<String> list = new ArrayList<>(List.of(

                "Anna", "Bob", "Chuck", "Dave"));

        list.forEach(System.out::println);

        calculator(Integer::sum, 10,25 );
        calculator(Double::sum, 10.23, 10.90);
    }

    private static <T> void calculator(BinaryOperator<T> func, T value1, T value2) {

        T result = func.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }
}
