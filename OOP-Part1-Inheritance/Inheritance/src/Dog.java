//Dog class Inherits from Animal

public class Dog extends Animal{

    private String earShape;
    private String tailShape;


    // calling the super() with arguments
    public Dog(){
        super("Mutt ", "big", 50);
    }

    // subclass constructor with args
    public Dog(String type, double weight){
      this(type, weight, "Perky" , "Curled");
    }

    // chaining the constructors

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium " : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    // toString() from the Object class()
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

        if(type == "Wolf"){
            System.out.println("Ooooo Woooo!");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tails");

        //calling private methods
        if(speed == "slow") {
            walk();
            wagTail();

        } else {
            run();
            bark();
        }
        System.out.println();
    }




    private void bark(){
        System.out.println("Woof!");
    }

    private void run(){
        System.out.println("Running");
    }

    private void walk(){
        System.out.println("Walking");
    }
    private void wagTail(){
        System.out.println("Tail Wagging");
    }




}
