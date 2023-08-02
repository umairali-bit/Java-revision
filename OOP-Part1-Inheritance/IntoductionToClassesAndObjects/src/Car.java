public class Car {

    // creating fields

    private String make = "G-Wagon";
    private String model = "G63";
    private String color = "Black";
    private int doors = 5;
    private boolean convertible = false;

    //get make
    public String getMake() {
        return make;
    }

    // get color
    public String getColor() {
        return color;
    }

    //get doors
    public int getDoors() {
        return doors;
    }

    //get model
    public int getModel() {
        return doors;
    }

    //isConvertibel?
    public boolean isConvertible() {
        return convertible;
    }
    //non-static method cuz we are accessing the instances in the class

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + "  " +
                make + "  " +
                model + "  " +
                (convertible? "Convertible" : " "));
    }

}
