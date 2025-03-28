package dev.lpa;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

        //getting N char with numbers using Arrays.stream
        seed += 15;
        int nSeed = seed;

        String[] oLabels = new String[15];
        Arrays.setAll(oLabels, i-> "N" + (nSeed + i));
        var streamN = Arrays.stream(oLabels);


        //using stream.of for the next char
        seed += 15;
        var streamG = Stream.of("G46", "G47", "G48", "G49","G50",
                "G51","G52","G53","G54","G55","G56","G57","G58","G59","G60");



        streamG.forEach(System.out::println);
        }


    }

