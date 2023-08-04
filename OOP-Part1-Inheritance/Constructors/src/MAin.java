public class MAin {

    public static void main(String[] args) {



        //BankAccount BankAccount = new BankAccount();// itll call the constructor

        //usage of a constructor. calling 2nd constrctor
        //BankAccount BankAccount = new BankAccount(12345, 1000.00, "Bob Brown", "myemail@bob.com",
               // 6092569967L);


        // calling the 1st constrctor
        BankAccount BankAccount = new BankAccount();

        System.out.println(BankAccount.getAccountNumber());
        System.out.println(BankAccount.getAccountBalance());

        /*
        due to using the constructor we are no longer required to use setters by calling the setters method.
         */

       // BankAccount.setCustomerName("Bob Brown");
        //BankAccount.setCustomerEmail("bobBrown@gmail.com");
        //ankAccount.setPhoneNumber(6092568898L);
      //  BankAccount.depositFund(1000);
        BankAccount.withdrawFund(800);
        BankAccount.withdrawFund(200);

        //calling 3rd constructor with some default values in the 3rd constructor and having other values set while
        // instantiating the object

        BankAccount umairAccount = new BankAccount("Umair", "umairmamoor@gmail.com", 6092569967l);
        System.out.println("AccountNO: " + umairAccount.getAccountNumber() +
                "; name " + umairAccount.getCustomerName() +
                "; balance " + umairAccount.getAccountBalance() +
                "; customer's email " + umairAccount.getCustomerEmail());
    }
}
