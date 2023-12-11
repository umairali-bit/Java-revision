package dev.lpa;

public class Brush extends ProductForSale{


    public Brush(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {

        System.out.println( type + "  brush was manufactured in Virginia");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);

    }


}
