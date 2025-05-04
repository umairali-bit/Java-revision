package dev.lpa;

import java.math.BigDecimal;
import java.util.Arrays;

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

        double totalUsingFloat = policyAmount - ((policyAmount * percentageFloat) * beneficiaries);
        System.out.printf("totalUsingFloat: %,.2f%n", totalUsingFloat);

        double total = policyAmount - ((policyAmount * percentage) * beneficiaries);
        System.out.printf("total: %,.2f%n", total);


//        setting up code that will create BigDecimals

        String[] tests = {"15.456", "8", "100000.000001", ".123"};
        BigDecimal[] bds = new BigDecimal[tests.length];
        Arrays.setAll(bds, i -> new BigDecimal(tests[i]));


        System.out.printf("%-14s %-15s %-8s %s%n", "Value", "Unscaled Value", "Scale", "Precision");










    }
}
