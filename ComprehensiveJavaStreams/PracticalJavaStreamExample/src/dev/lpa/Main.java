package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;



        for (char c : "BINGO".toCharArray()){
            for (int i = start; i<(start + 15); i++) {
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


        List<String> firstOnes = bingoPool.subList(0,15);
        firstOnes.sort(Comparator.naturalOrder());
//
//        firstOnes.replaceAll(s-> s.charAt(0) + "-" + s.substring(1));
//        System.out.println(firstOnes);



        firstOnes.replaceAll( s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;

            }
            return s;
        });





    }







}
