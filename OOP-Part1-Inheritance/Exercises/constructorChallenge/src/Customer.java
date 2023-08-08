public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //1st constructor
    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    }

    //2nd constructor
    public Customer(){
        this("nobody", "nobody@nowhere.com");
    }


    //3rd constructor
     public Customer(String name, String email){
        this(name,1000, email);


     }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
