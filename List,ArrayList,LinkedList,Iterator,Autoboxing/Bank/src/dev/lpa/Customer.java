package dev.lpa;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
