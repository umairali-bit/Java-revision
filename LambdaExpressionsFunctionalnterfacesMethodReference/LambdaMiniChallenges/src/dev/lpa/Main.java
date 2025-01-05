package dev.lpa;

import java.util.Arrays;
import java.util.Locale;
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
        /*
        challenge 5, call the method from challenge 4, passing the lambda varibale created earlier and the string
        1234567890, then print the result eturned from the method
         */
        String result = everySecondCharacter(everySecondChar,"1234567890");
        System.out.println(result);


        UnaryOperator<String> everySecondChar3 = source -> {

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };
        // challenge3. print out with function interface with an argument 1234567890
        System.out.println(everySecondChar3.apply("1234567890"));

    }
        // challenge2 change the following method into Lambda expression
        public static String everySecondChar1 (String source){

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        }


        //challenge 4
        /*
        Instead of using the everySecondChar1 function directly.suppose we want to pass it to a method
        Write a method n your class, called everySecondCharacter. This method should accept the function or a unaryOperator
        , as a parameter, as well as a second parameter that lets us pass "123456789"
        The method should execute the functional method on the first argument, passing it to the value of e String passed,
        from the enclosing method.
         */
        public static String everySecondCharacter (Function<String, String> func, String source ) {
       return func.apply(source);

        }


    }


