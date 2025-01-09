package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {

        String name = "Tim";
        //Function<String,String> u1Case = s -> s.toUpperCase();
        Function<String, String> uCase = String :: toUpperCase;

        System.out.println(uCase.apply(name));

        //anThen()
        //Function<String, String> lastName1 = name::concat;
        Function<String, String> lastName = s-> s.concat(" Buchalka");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        //compose() works only with function or a Unary operator
        // it will execute last name concatenation first and then uppercase uCase execution
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));


        //chaining lambda. The last function in the chain needs to return a value that matches the declared return type
        // specified by the Function
        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name));


        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen (s-> String.join(", ",s))
                //.andThen(s -> s.length());
                .andThen(String::length);
        System.out.println(f2.apply(name));


        String[] names = {"Anna", "Bob", "Carol"};
        Consumer<String> s0 = (s -> System.out.print(s.charAt(0)));
        Consumer<String> s1 = System.out::println;
        Arrays.asList (names).forEach(s0
                .andThen(s-> System.out.print(" - "))
                .andThen(s1));


        Predicate<String> p1 = s -> s.equals("TIM");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Tim");
        Predicate<String> p3 = s -> s.startsWith("T");
        Predicate<String> p4 = s -> s.endsWith("e");

        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name));

        Predicate<String> combine2 = p3.and(p4);
        System.out.println("combine2 = " + combine2.test(name));

        //opposite of combine 2, negate method
        Predicate<String> combine3 = p3.and(p4).negate();
        System.out.println("combine3 = " + combine3.test(name));
    }


}
