package dev.lpa.Operators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //addition operator
        int a = 12;
        int b = 7;
    //    int result = a + b;
        System.out.println(a + b);

        //subtraction operator
        int c = 12;
        int d = 7;
        //    int result = c - d;
        System.out.println(c - d);

        //multiplication operator
        int e = 12;
        int f = 7;
        //    int result = e * f;
        System.out.println(e * f);

        //division operator
        int g = 12;
        int h = 7;
        //    int result = g / h;
        System.out.println((double) g / h);

        //modulus operator
        int i = 12;
        int j = 7;
        //    int result = i % j;
        System.out.println((double) i % j);


        //addition operator
        int k = 12;
        int l = 7;
        int result = k += l;
        System.out.println(result);

        //subtraction operator
        int m = 12;
        int n = 7;
        int results = m -= n;
        System.out.println(results);


        //relational operators
        int firstNumber = 12;
        int secondNumber = 16;

        System.out.println(firstNumber == secondNumber);// false
        System.out.println(firstNumber > secondNumber);// false
        System.out.println(firstNumber >= secondNumber);// false
        System.out.println(firstNumber <= secondNumber);// true


        //logical operators
        boolean firstExpression = true;
        boolean secondExpression = false;

        System.out.println(firstExpression && secondExpression);//false
        System.out.println(firstExpression || secondExpression);//true
        System.out.println(!firstExpression);//false


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age = sc.nextInt();
//        System.out.println("Your age is " + age);

        int numberA = sc.nextInt();
        int numberB = sc.nextInt();

        int resultNumber = numberA + numberB;
        System.out.println(resultNumber);
        sc.close();





    }
}
