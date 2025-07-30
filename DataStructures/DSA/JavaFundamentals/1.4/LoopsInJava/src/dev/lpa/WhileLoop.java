package dev.lpa;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 0;
//
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);

        boolean hasLearnt = false;

        while(!hasLearnt) {

            System.out.println("Lets learn!!");
            System.out.println("Learnt?");
            hasLearnt = sc.nextBoolean();
        }

    }
}
