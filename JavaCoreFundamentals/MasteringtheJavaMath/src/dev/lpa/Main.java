package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE - 5;

//      Math.incrementExact(id)
        for (int j = 0, id = maxValue; j < 10; j++, id ++ ) //id = Math.incrementExact(id)) {
        {
            System.out.printf("Assigning id %,d%n", id);
        }


//      abs, returns the magnitude of a number ignoring its sign.
        System.out.println(Math.abs(-50));



    }
}
