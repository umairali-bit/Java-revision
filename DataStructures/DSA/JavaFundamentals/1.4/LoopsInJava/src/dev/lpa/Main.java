package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i<5; i++) {
            System.out.println(i + ": Hello World ");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc.nextInt();

        for (int i = 1; i<=10; i++) {
            System.out.println(n + " * " + i +" = " + i*n);
        }



    }
}
