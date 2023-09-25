import java.util.Locale;

public class MealOrder {
    //uses composition design. It has a "HAS-A" relationship with Items
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular","coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("Coke", drinkType, 1.00);
        this.side = new Item("Fries", sideType,2.30);

    }
    public double getTotalPrice(){
        return side.getAdjustedPrice()+ drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        //using static method to print
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.extraToppings(extra1,extra2,extra3);

    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
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

class Burger extends Item{

    //Burger has a "IS-A" relationship with Item. A burger is an item.
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price); //removed the type and added Burger
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "TURKEY BACON", "CHICKEN SALAMI" -> 1.5;
            default -> 0.0;
        };

    }

    public void extraToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("CHEESE",extra1, getExtraPrice(extra1));
        this.extra2 = new Item("CHICKEN SALAMI",extra2, getExtraPrice(extra2));
        this.extra3 = new Item("AVOCADO",extra3, getExtraPrice(extra3));
    }

    public void printItemizedList(){
        printItem("Base burger", getBasePrice());
        if(extra1 !=  null){
            extra1.printItem();

        }
        if(extra2 !=  null){
            extra2.printItem();

        }
        if(extra3 !=  null){
            extra3.printItem();

        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
