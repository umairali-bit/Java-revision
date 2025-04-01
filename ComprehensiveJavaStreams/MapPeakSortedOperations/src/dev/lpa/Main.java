package dev.lpa;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        /*

         IntStream.iterate with three-parameter version of iterate, 1st casting a char, predicate and Unary operator
         version of stream pipeline without any intermediate operations
         can be replaced by method reference Character::isAlphabetic
         dropWhile() takes a predicate and evaluate until it first becomes false
         .skip(5)
         .filter(i -> Character.toUpperCase(i) > 'E')
         takeWhile(i -> i < 'a') for range of alphabets
         .map (i -> Character.toUpperCase(i))
                .distinct() to include upperLetters in the output


           Using Stream.generate() with Supplier (takes no argument and returns a result) with
           limit(), distinct(), and sorted()

         */

        IntStream.iterate ((int) 'A', i -> i <= (int) 'z', i -> i +1)
                .filter(i -> Character.isAlphabetic(i))
                .map (Character::toUpperCase)
                .distinct()
//                .dropWhile(i-> Character.toUpperCase(i) <= 'E')
//                .takeWhile(i -> i <'a')
//                 .skip(5)
//                .filter(i -> Character.toUpperCase(i) > 'E')
                .forEach(d -> System.out.printf("%c ", d));


        System.out.println();
        Random random = new Random();
        Stream.generate(() -> random.nextInt((int) 'A', (int)'Z' + 1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));


    }
}
