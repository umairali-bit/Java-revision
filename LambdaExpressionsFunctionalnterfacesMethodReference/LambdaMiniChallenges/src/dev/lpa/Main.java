package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {

        // Challenge 1 convert the following anonymous class into a Lmabda expression

        Consumer<String> printTheParts = new Consumer<String>() {

            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }

        };

        //Ans1.1
        Consumer<String> printThePartLambda = sentence -> {

            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printTheParts.accept("Hop little bunnies Hop Hop Hop");
        printThePartLambda.accept("Hop little bunnies Hop Hop HOP");


        //Ans1.2
        Consumer<String> printThePartForeach = sentence -> {

            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printThePartForeach.accept("Lets split this up into an array");


        //Ans 1.3
        Consumer<String> printConsiceForeach = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach (s -> System.out.println(s));
        };

        printConsiceForeach.accept("Lets split this up into an array");

    }


}
