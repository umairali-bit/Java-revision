package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE - 5;

        for (int j = 0, id = maxValue; j < 10; j++, id++) {
            System.out.printf("Assigning id %,d%n", id);
        }

    }
}
