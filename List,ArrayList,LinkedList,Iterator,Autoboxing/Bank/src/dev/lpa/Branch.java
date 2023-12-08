package dev.lpa;

import java.util.ArrayList;

public class Branch {

    private String nameOfBranch;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
        this.customers = new ArrayList<>();
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){

        if (findCustomer(nameOfCustomer) == null) {

            //customers.add(new Customer(nameOfCustomer, initalTransaction);

            Customer customer = new Customer(nameOfCustomer, initialTransaction);
            customers.add(customer);
            System.out.println("Customer is successfully added");
            return true;

        }
        return false;

    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){


        Customer existingCustomer = findCustomer(nameOfCustomer);

        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }

        return false;

    }

    private Customer findCustomer(String nameOfCustomer){

        for(int i = 0; i<customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getCustomerName().equals(nameOfCustomer)){
                return customer;
            }
        }
        return null;
    }
}
