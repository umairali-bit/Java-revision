package dev.lpa;

public class Shampoo extends ProductForSale{


    public Shampoo(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {

        System.out.println( type + " shampoo is good for hair");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);

    }


}
