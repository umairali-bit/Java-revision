package dev.lpa;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        //IntStream.iterate with three-paramter version of iterate, 1st casting a char, predicate and Unary operator
        // version of stream pipeline without any intermediate operations
        IntStream.iterate ((int) 'A', i -> i <= (int) 'z', i -> i +1)
                .forEach(d -> System.out.printf("%c ", d));

    }
}
