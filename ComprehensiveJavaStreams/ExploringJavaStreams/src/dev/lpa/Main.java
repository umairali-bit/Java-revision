package dev.lpa;

import java.util.*;
import java.util.stream.IntStream;
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
                .map(s -> s.charAt(0) + "-" + s)
                .forEach(System.out::println);


        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for (char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int labelNumber = bingoIndex;
            Arrays.setAll(numbers, i-> i + labelNumber);
            myMap.put(c,numbers);
            bingoIndex += 15;
        }


//       myMap.entrySet()
//               .forEach((key) -> {
//                   System.out.println(key.getKey() + " has range: " + key.getValue()[0] + "-" + key.getValue()[key.getValue().length -1]);
//               });



        myMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range: " + e.getValue()[0] + "-" + e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

        System.out.println("\n------------------------");



        //static method generate on the Stream interface. This method takes a supplier
        Random random = new Random();
        Stream.generate(() -> random.nextInt(2)) //supplier interface generating a supplier of result.
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n------------------------");


        /*

        Iterate method on Stream class. It gives us an option to generate either a finite or infinite stream.
        infinite stream example. The simplest form of Stream.iterate takes two arguments. The first is seed or
         starting value, and after that its a Unary Operator.

         */

        //using IntStream because well be dealing with integers
        IntStream.iterate(1, n-> n + 1)//unary operator
                .limit(20)
                .forEach(s -> System.out.print(s + " "));







    }

}
