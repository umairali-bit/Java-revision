package dev.dto;

/*
Create a Transaction class in a dev.dto package that will mirror a data table.
This class should have the fields shown below, and need to include getters and setters for all fields.
Also include a constructor that takes all fields, for ease of use.

 */

public class Transaction {

    private int routingNumber;
    private int customerId;
    private long transactionId;
    private double transactionAmount;

    public Transaction(int routingNumber, int customerId, long transactionId, double transactionAmount) {
        this.routingNumber = routingNumber;
        this.customerId = customerId;
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
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
        return transactionAmount;
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
        this.transactionAmount = transactionAmount;
    }
}
