public class SmartKitchen {

    // creating classes
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishWasher;

    //instantiating our classes in constructor
    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new Dishwasher();
    }

    //getters
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag){
        brewMaster.setHasWorkTodo(coffeeFlag);
        iceBox.setHasWorkTodo(fridgeFlag);
        dishWasher.setHasWorkTodo(dishwasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffee(){
        if(hasWorkTodo){
            System.out.println("Brewing Coffee");
            hasWorkTodo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void orderFood(){
        if(hasWorkTodo){
            System.out.println("Ordering food");
            hasWorkTodo = false;
        }
    }
}

class Dishwasher {
    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void doDishes(){
        if(hasWorkTodo){
            System.out.println("Washing dishes");
            hasWorkTodo = false;
        }
    }
}
