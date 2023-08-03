public class bankAccount {

    private int accountNumber = 1234567;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private Long phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFund(double accountBalance){
        this.accountBalance += accountBalance;
        System.out.println("Your balance is " + accountBalance);

    }

    public void withdrawFund(double withDrawlAmount){
        if(accountBalance - withDrawlAmount < 0){
            System.out.println("Insufficient balance");
        } else {
            accountBalance -= withDrawlAmount;
            System.out.println("Your balance is " + accountBalance + " and the withdrawl amount was " + withDrawlAmount);
        }

    }
}
