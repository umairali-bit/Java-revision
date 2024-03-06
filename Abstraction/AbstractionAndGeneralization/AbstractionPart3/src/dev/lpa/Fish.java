package dev.lpa;

//concrete class that extends an abstract class
public class Fish extends Animal {


    public Fish(String type, String size, double weight) {
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

        if(type == "Goldfish") {    //type could easily be accessed from the parent class cuz its protected
            System.out.println("swish!");
        } else {
            System.out.println("splash!");
        }

    }
}

