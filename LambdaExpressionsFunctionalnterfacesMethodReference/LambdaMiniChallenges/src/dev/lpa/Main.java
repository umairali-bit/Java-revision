package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printConsiceForeach.accept("Lets split this up into an array");


        //Ans 2
        Function<String, String> everySecondChar = source -> {

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

                return returnVal.toString();


        };

        UnaryOperator<String> everySecondChar3 = source -> {

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };
        // 3. print out with function interface with an argument 1234567890
        System.out.println(everySecondChar3.apply("1234567890"));

    }
        // 2 change the following method into Lambda expression
        public static String everySecondChar1 (String source){

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        }


    }


