package dev.lpa;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {


        calculator((a,b) -> (a + b), 10,20 );
        //same thing in method reference
        calculator(Integer:: sum, 10,20);
        calculator(Double::sum, 10.25, 20.24);

        calculator((v1,v2) -> v1 + v2 , "Hello ","World");
        calculator((v1,v2) -> v1.concat(v2), "Hello ", "World");
        calculator(String::concat, "Hello ","World");

        BinaryOperator <String> b1 = (v1,v2)-> v1.concat(v2);
        BiFunction<String, String, String> b2 = (v1,v2) -> v1.concat(v2);
        UnaryOperator<String> b3 = v1 -> v1.toUpperCase();
        //same thing
        BinaryOperator <String> b10 = String::concat;
        BiFunction<String, String, String> b20 = String::concat;
        UnaryOperator<String> b30 = String::toUpperCase;

        System.out.println("-----------------");

        System.out.println(b1.apply("Hello ","World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(b3.apply("Hello"));

        System.out.println("-----------------");
        System.out.println(b10.apply("Hello ","World"));
        System.out.println(b20.apply("Hello ", "World"));
        System.out.println(b30.apply("Hello"));




    }

    public static <T> void calculator(BinaryOperator<T> func, T value1, T value2) {

        T result = func.apply(value1,value2);
        System.out.println("Result of operation: " + result);
    }
}
