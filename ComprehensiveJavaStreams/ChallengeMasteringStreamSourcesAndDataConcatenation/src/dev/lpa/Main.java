package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int seed = 1;
        var streamB = Stream.iterate(seed, n -> n <= 15, n -> n + 1 ) //finite stream
                .map(i -> "B" + i);//mapping the integer to B, then is followed by the generated number
        streamB.forEach(System.out::println);
        }


    }

