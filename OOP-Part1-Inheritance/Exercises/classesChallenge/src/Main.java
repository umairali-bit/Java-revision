public class Main {

    public static void main(String[] args) {



        bankAccount BankAccount = new bankAccount();


        BankAccount.setCustomerName("Bob Brown");
        BankAccount.setCustomerEmail("bobBrown@gmail.com");
        BankAccount.setPhoneNumber(6092568898L);
        BankAccount.depositFund(1000);
        BankAccount.withdrawFund(800);
        BankAccount.withdrawFund(200);

    }
}
