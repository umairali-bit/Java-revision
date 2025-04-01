package dev.lpa;

import java.util.stream.IntStream;

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


         */

        IntStream.iterate ((int) 'A', i -> i <= (int) 'z', i -> i +1)
                .filter(i -> Character.isAlphabetic(i))
                .dropWhile(i-> Character.toUpperCase(i) <= 'E')
                .takeWhile(i -> i <'a')
                // .skip(5)
                //.filter(i -> Character.toUpperCase(i) > 'E')
                .forEach(d -> System.out.printf("%c ", d));

    }
}
