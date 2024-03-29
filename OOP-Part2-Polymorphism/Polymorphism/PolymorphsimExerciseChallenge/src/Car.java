
//base class
public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }



    public String startEngine(){
      return  (getClass().getSimpleName() + " engine is running ");
    }
    public String accelerate(){
       return (getClass().getSimpleName() +" engine is accelerating ");
    }
    public String brake(){
        return (getClass().getSimpleName() + " engine is braking ");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return super.startEngine();
    }

    @Override
    public String accelerate() {
       return super.accelerate();
    }

    @Override
    public String brake() {
       return super.brake();
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return super.startEngine();
    }

    @Override
    public String accelerate() {
       return super.accelerate();
    }

    @Override
    public String brake() {
      return  super.brake();
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return super.startEngine();
    }

    @Override
    public String accelerate() {
       return super.accelerate();
    }

    @Override
    public String brake() {
       return super.brake();
    }
}

