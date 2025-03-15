package dev.bank;

/*
Write Immutable classes for a Bank Account and a Bank Customer

create a BankAccount class.
This should have a type, indicating the type of account, like Checking or Savings or some other type.
It should have a balance, the initial dollar amount in the account.


modify your BankAccount class.
First, change the balance so that it's mutable.
Include a Transaction Collection.

Provide a getter, or accessor method, for the transaction data.
Provide a method to adjust the balance, and add the transaction data to the transaction collection.



 */

import dev.dto.Transaction;

import java.util.LinkedHashMap;
import java.util.Map;

public class BankAccount {


  public enum AccountType {SAVING, CHECKING}

    private final AccountType accountType;
    private double balance;
    public final Map<Long, Transaction> transactions = new LinkedHashMap<>();


    BankAccount(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    /*
    public Map<Long, Transaction> getTransactions() {
        return Map.copyOf(transactions); //returning an unmodifiable collection, to try to safeguard this data
    }
    instead of returning unmodifiable collection containing mutable data , return a map of immutable instances, Strings.
    Another map variable txMap. Loop through the entries of transactions while inserting the same key, so tx.getKey, but
    the value wont be the transaction but rather will be the String value of transaction.
   */

    public Map<Long, String> getTransactions() {
        Map<Long, String> txMap = new LinkedHashMap<>();
        for (var tx : transactions.entrySet()) {
            txMap.put(tx.getKey(),tx.getValue().toString());
        }
        return txMap;

    }

    @Override
    public String toString() {
        return "%s $%.2f".formatted(accountType, balance);
    }

    //Provide a way to change the balance on an account by a private method called commitTransaction()
    void commitTransaction(int routingNumber, long transactionId,
                           String customerId, double amount) {


        balance += amount; //adjusting the balance, A withdrawal would come in a negative number so we can simply add the amount in either case

        //creating a transaction and putting it in this account's map.
        transactions.put(transactionId,
                new Transaction(routingNumber, transactionId ,
                        Integer.parseInt(customerId), amount));


    }



}
