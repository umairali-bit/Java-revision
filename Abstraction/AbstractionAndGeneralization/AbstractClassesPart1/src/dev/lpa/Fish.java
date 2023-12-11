package dev.lpa;

public class Fish extends Animal{   //concrete Dog class

    public Fish(String type, String size, double weight) {   //mandatory constructor
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")) {
            System.out.println(getExplicitType() + " lazily swimming ");
        } else {
            System.out.println(getExplicitType() + " darting frantically ");

        }
    }

    @Override
    public void makeNoise() {

        if(type == "Goldfish") {        // type is from Animal abstract
            System.out.println("swish");
        } else {
            System.out.println("splash");
        }
    }

}
