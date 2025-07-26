package dev.lpa.Fundamentals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int age = 4;

        if (age >= 18) {

            System.out.println("You can vote");
            System.out.println("Good morning");

        } else {
            System.out.println("You cannot vote!");
        }

        int day = 3;

        if (day == 1) {
            System.out.println("Go Home!");
        } else if(day == 2) {
            System.out.println("Go to firends!");
        } else if (day == 3) {
            System.out.println("Go to Party");
        }
        else {
            System.out.println("Office!");
        }
        System.out.println("Hello World");

        //ternary operator

        int g = 12;
        int d = 23;
        int max = 0;

        //ternary operator
        max = (g>d) ? g : d;

        System.out.println(max);


        //nested ifElse

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");

        int a = sc.nextInt();

        System.out.println("Please enter a second number");

        int b = sc.nextInt();

        System.out.println("Please enter a third number");

        int c = sc.nextInt();

        if (a>b) {
            System.out.println("a is bigger than b");

            if (a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is the largest number");
            } else{
                System.out.println("c is bigger than a");
                System.out.println("c is the largest number");
            }
            } else {
            System.out.println("b is bigger than a");
            if (b > c) {
                System.out.println("c is bigger than b");
                System.out.println("b is the largest");
            } else {
                System.out.println(" c is greater than b");
            }
        }






    }
}
