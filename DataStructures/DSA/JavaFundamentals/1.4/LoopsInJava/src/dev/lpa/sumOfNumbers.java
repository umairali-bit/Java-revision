package dev.lpa;

import java.util.Scanner;

public class sumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i ++) {

            //sum = sum + 1 - sum of first 5 number
            sum = sum + (2*i);// sum of first 5 even numbers
        }
        System.out.println("Sum is: " + sum);

    }
}
