package dev.lpa;

public class Fish extends Animal{   //concrete Dog class

    public Fish(String type, String size, double weight) {   //mandatory constructor
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")) {
            System.out.println(type + " walking ");
        } else {
            System.out.println(type + " running ");

        }
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf") {        // type is from Animal abstract
            System.out.println("Howling");
        } else {
            System.out.println("Woof! ");
        }
    }

}
