package dev.lpa;

public class Main {

    public static void main(String[] args) {

        /*
        imagine that you work for a life insurance company, and you are responsible for generating
        the code to distribute funds to beneficiaries.The last client who recently passed away, has a 100-million-dollar
        policy. He has three beneficiaries, with equal shares.
         */


        double policyAmount = 100_000_000;
        int beneficiaries = 3;
        float percentageFloat = 1.0f / beneficiaries;
        double percentage = 1.0 / beneficiaries;

        System.out.printf("Payout = %,.2f%n", policyAmount * percentageFloat);
        System.out.printf("Payout = %,.2f%n", policyAmount * percentage);


    }
}
