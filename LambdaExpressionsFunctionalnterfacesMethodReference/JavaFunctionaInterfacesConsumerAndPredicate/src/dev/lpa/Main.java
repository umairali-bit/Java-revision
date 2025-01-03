package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        

        int result = calculator((var a, var b) -> {var c = a + b; return c;}, 5, 2);
        var result2 = calculator((a, b) -> a/b, 10.0, 2.5);
        var result3 = calculator(
                (a,b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden"
        );

        /*
        list of arrays both having two double values by creating a local variable coords and simplifying the trype declaration
        by letting Java infer it, with var
         */

        var coords = Arrays.asList(
                new double[] {47.2160, -95.2348},
                new double[] {29.1566, -89.2495},
                new double[] {35.1556, -90.0659});

        // printing out the list by using the enhanced for loop
        coords.forEach(s-> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat,lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("--------");

        coords.forEach(s -> processPoint(s[0],s[1], p1));
    }

    //public static method with three arguments, instance of interface Operations and two values
    public static <T> T calculator(BinaryOperator<T> functions, T value1, T value2){ //instead of using our own interface we are using BinaryOperator.

        T result = functions.apply(value1,value2); //The functional method name of the Binary Operator is "apply"
        System.out.println("Result of operation: " + result);
        return result;

    }

    //creating a generic method without the return type with BiConsumer
    public static <T> void processPoint (T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1,t2);
    }


}
