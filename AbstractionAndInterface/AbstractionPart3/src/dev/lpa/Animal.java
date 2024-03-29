package dev.lpa;

abstract class Mammals extends Animal {

    public Mammals(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType()+ " ");
        System.out.println(speed.equals("slow") ? "walk" : "runs");

    }
    //adding an abstract()
    public abstract void shedHair();
}

public abstract class Animal {

    //3 fields type, size and weight

    protected String type; //protected field means subclasses can access 'type' directly without a given method
    private String size;
    private double weight;


    //constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //abstract methods cannot have a method body, cant be private.
    public abstract void move(String speed);
    public abstract void makeNoise();

    //concrete method on abstract class
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }

}

