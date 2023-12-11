package dev.lpa;

public class Dog extends Mammal{   //concrete Dog class

    public Dog(String type, String size, double weight) {   //mandatory constructor
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")) {
            System.out.println(getExplicitType() + " walking ");
        } else {
            System.out.println(getExplicitType() + " running ");

        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " always shed");
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

