package dev.lpa;

import java.util.ArrayList;

public class Bank {


    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch){

        if(findBranch(nameOfBranch) == null) {
            branches.add(new Branch(nameOfBranch));

            return true;
        }

        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){

        Branch branch = findBranch(nameOfBranch);

        if(branch != null) {
            return branch.newCustomer(nameOfCustomer, initialTransaction);
        }


        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String customerName, double transaction) {

       Branch branch = findBranch(nameOfBranch);

       if(branch != null) {
           return branch.addCustomerTransaction(customerName, transaction);
       }

        return false;
    }


    private Branch findBranch(String nameOfBranch){

     for(int i = 0; i< branches.size(); i ++){
         Branch checkedBranch = branches.get(i);
         if(checkedBranch.getNameOfBranch().equals(nameOfBranch));
         return checkedBranch;
     }
     return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getNameOfBranch());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + (i+1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }


}
