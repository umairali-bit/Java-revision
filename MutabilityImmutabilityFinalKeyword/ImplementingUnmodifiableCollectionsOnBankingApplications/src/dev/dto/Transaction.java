package dev.dto;

/*
Create a Transaction class in a dev.dto package that will mirror a data table.
This class should have the fields shown below, and need to include getters and setters for all fields.
Also include a constructor that takes all fields, for ease of use.

 */

public class Transaction {

    private int routingNumber;
    private long transactionId;
    private int customerId;

    private double amount;

    public Transaction(int routingNumber, long transactionId, int customerId, double amount) {
        this.routingNumber = routingNumber;
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public double getTransactionAmount() {
        return amount;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.amount = transactionAmount;
    }

    @Override
    public String toString() {
        return "%015d:%020d:%015d:%012.2f".formatted(routingNumber, customerId, transactionId, amount);
    }
}
