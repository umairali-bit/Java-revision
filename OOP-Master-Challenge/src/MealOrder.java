import java.util.Locale;

public class MealOrder {
    //uses composition design. It has a "HAS-A" relationship with Items
}

class Item {

    //It is a base class

    private String name; //could be burger, drink side or a topping
    private String type;
    private double price;
    private String size = "Medium";

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if(type.equals("SIDE")||type.equals("DRINK")){
            return size +" "+ name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch(size){
            case "SMALL"-> getBasePrice() -0.5;
            case "LARGE" -> getBasePrice() +1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}

class Burger {

    //Burger has a "IS-A" relationship with Item. A burger is an item.

}
