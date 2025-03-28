package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int seed = 1;
        var streamB = Stream.iterate(seed, n -> n <= 15, n -> n + 1 ) //finite stream on static iterate(), using unary operator
                .map(i -> "B" + i);//mapping the integer to B, then is followed by the generated number

        seed += 15;
        var streamI = Stream.iterate(seed, i -> i + 1)//infinite stream with predicate
                                    .limit(15)
                                        .map(n -> "I" + n);

        streamI.forEach(System.out::println);
        }


    }

