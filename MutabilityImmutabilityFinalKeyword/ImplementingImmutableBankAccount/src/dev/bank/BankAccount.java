package dev.bank;

/*
Write Immutable classes for a Bank Account and a Bank Customer

create a BankAccount class.
This should have a type, indicating the type of account, like Checking or Savings or some other type.
It should have a balance, the initial dollar amount in the account.

 */

public class BankAccount {


  public enum AccountType {SAVING, CHECKING}

    private final AccountType accountType;
    private final double balance;


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


    @Override
    public String toString() {
        return "%s $%.2f".formatted(accountType, balance);
    }
}
