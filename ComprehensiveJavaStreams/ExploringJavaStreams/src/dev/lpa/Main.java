package dev.lpa;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;


        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
                //               System.out.println("" + c + i);
            }


            start += 15;
        }

        Collections.shuffle(bingoPool);

        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));

        }

        System.out.println("-".repeat(50));


//       List<String> firstOnes = bingoPool.subList(0,15);//original list
        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));// always a good idea to create a copy of the original list

        firstOnes.sort(Comparator.naturalOrder());
//
//        firstOnes.replaceAll(s-> s.charAt(0) + "-" + s.substring(1));
//        System.out.println(firstOnes);


        firstOnes.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }
            return s;
        });

        System.out.println("\n------------------------");


        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));
        }
        System.out.println("\n------------------------");

//        chain of listing 5 operations on stream mentioned below is called Pipeline
        var tempStream = bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();
//                .forEach(s -> System.out.print(s + " "));

        tempStream.forEach(s -> System.out.println(s + ""));

        System.out.println("\n------------------------");


        //tempStream.forEach(s -> System.out.println(s.toLowerCase() + ""));


        String[] strings = {"One","Two","Three"};
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);//s -> sout(s)

        var secondStream = Stream.of("Six","Five", "Four")
                .map(String::toUpperCase); //String -> String.toUpperCase()
//                .forEach(System.out::println);// String -> sout(String)


        Stream.concat(secondStream, firstStream)
                .forEach(String -> System.out.println(String));


    }

}
