package dev.lpa;

import java.util.Comparator;
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

           i.toString() could also be used as a method reference (Seat::toString)


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

        System.out.println();
        int maxSeats = 100;
        int seatsInRow = 10;
        var stream = Stream.iterate(0, i -> i < maxSeats, i -> i + 1)
                .map(i -> new Seat((char) ('A' + i / seatsInRow), i % seatsInRow + 1))
                .skip(5)
                .limit(10)
                .peek(s -> System.out.println( "---->" + s))
                .sorted(Comparator.comparing((Seat s) -> s.price())
                                .thenComparing(i -> i.toString()));
//                .mapToDouble(i -> i.price())
//               .map(i -> i.toString());
//                .boxed()
//                .map(i -> "%.2f".formatted(i));

        stream.forEach(System.out::println);



    }
}
