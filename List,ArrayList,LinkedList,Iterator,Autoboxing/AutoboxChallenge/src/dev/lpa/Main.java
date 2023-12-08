package dev.lpa;
import java.util.ArrayList;



record Customer (String name, ArrayList<Double> transactions){

   public Customer(String name, double initialDeposit){
       this(name.toUpperCase(),
               new ArrayList<>(500));
       transactions.add(initialDeposit);                 //boxing, converting a primitive type to a reference type and saving it in the transactions list

   }
}

public class Main {

    public static void main(String[] args) {

        //creating a customer Object
        Customer bob = new Customer("Bob S", 100.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);

        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.01);
        bank.printStatement("Jane A");



    }
}


class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    //to see if the customer already exists in Customer record
    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) was not found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){


        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        Customer customer = getCustomer(name);

        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {

        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for(double d : customer.transactions()){     //unboxing

            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
