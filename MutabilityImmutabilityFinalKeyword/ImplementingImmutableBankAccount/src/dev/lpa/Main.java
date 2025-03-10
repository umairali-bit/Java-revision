package dev.lpa;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(BankAccount.Account.CHECKING, 500);
        System.out.println(bankAccount);

    }
}
