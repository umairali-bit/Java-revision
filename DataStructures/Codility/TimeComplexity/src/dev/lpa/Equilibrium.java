package dev.lpa;

public class Equilibrium {

    public static void main(String[] args) {

        Equilibrium solver = new Equilibrium();

        int[] A = {3,1,2,4,3};

        System.out.println("Array");
        printArray(A);

        System.out.println("Equilibrium");
        int a = solver.solution(A);
        System.out.println(a);


    }

    public int solution(int[] A) {

    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }


}
