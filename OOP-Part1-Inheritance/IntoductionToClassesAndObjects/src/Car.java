public class Car {

    // creating fields

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;


    //non-static method cuz we are accessing the instances in the class

    public void describeCar(){
        System.out.println(doors + "Door" +
                color + "  " +
                make + "  " +
                model + "  " +
                (convertible? "Convertible" : " "));
    }

}
