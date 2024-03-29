package dev.lpa;

//concrete class that extends an abstract class
public class Dog extends Mammals {


    public Dog(String type, String size, double weight) {
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
        System.out.println(getExplicitType() + " sheds all the time");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf") {    //type could easilt be accessed from the parent class cuz its protected
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }

    }
}

