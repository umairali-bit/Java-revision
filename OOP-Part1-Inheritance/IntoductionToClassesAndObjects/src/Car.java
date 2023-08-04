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
    public String getModel() {
        return model;
    }

    //isConvertibel?
    public boolean isConvertible() {
        return convertible;
    }

    //set make
    public void setMake(String make) {

        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche" , "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    //set model
    public void setModel(String model) {
        this.model = model;
    }

    //set color
    public void setColor(String color) {
        this.color = color;
    }

    //set doors
    public void setDoors(int doors) {
        this.doors = doors;
    }

    //set convertible
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
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
