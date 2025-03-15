package dev.lpa;

import dev.bank.Bank;
import dev.bank.BankAccount;
import dev.bank.BankCustomer;
import dev.dto.Transaction;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

//        BankCustomer joe = new BankCustomer("Joe",500.00, 10000.00);
//        System.out.println(joe);


        Bank bank = new Bank(3214567);
        bank.addCustomer("Joe", 500, 10000);

        BankCustomer joe = bank.getCustomer("000000010000000");
        System.out.println(joe);

        //adding funds to joes account by using doTransaction()

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, 35)) {
            System.out.println(joe);

        }

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, -535)) {
            System.out.println(joe);
        }

        //getting the checking account from Joe's BankCustomer instance
        BankAccount checking = joe.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((k, v) -> System.out.println(k + ": " + v));


        //new transaction directly into the variable
//        transactions.put(3L, new Transaction(1, 1,
//                Integer.parseInt(joe.getCustomerId()), 500));


//        System.out.println("-".repeat(30));
//        for (var tx : transactions.values()) {
//            tx.setCustomerId(2);
//            tx.setTransactionAmount(10000.00);
//
//        }
//        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().clear();
        System.out.println("-".repeat(30));

        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions()
                .forEach((k,v) -> System.out.println(k + ": " + v));



    }
}
