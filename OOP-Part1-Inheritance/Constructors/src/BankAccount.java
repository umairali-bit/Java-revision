public class BankAccount {

    private int accountNumber = 1234567;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private Long phoneNumber;

    // constructor to instantiate an object
    public BankAccount(){
        //calling the other constructor within the constructor (constructor chaining)
        this(123456, 2.50, "Default name", "Default address", 609256997l);
        System.out.println("Empty constructor called");
    }

    //2constructor
    public BankAccount(int accountNumber, double accountBalance, String customerName,
                       String email, Long phone ) {

        System.out.println("Account constructor with parameters called");
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        customerEmail = email; //no use of this because parameters have a different name
        phoneNumber = phone; //no use of this because parameters have a  different name

    }

    //3rd constructor setting accountnumber and accountBalance but having default name email and phone number
    public BankAccount(String customerName, String customerEmail, Long phoneNumber) {
        this(9999, 100.55,customerName,customerEmail, phoneNumber );
        //this.customerName = customerName;
        //this.customerEmail = customerEmail;
        //this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
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

