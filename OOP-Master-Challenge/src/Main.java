/*


1. Bill runs a fast food Hamburger restaurant, and sells Hamburger meals. His meal orders are composed of three items,
    the hamburger, the drink, and the side item. This application lets Bill select the type of burgers, and some additional
    items or extras, that can be added to the burgers as well as the actual pricing.

2. You need a meal order
    the meal order should exactly be composed
    of, one burger, one drink, and one side item. The most common meal order should be created without any arguments, like a
    regular burger, a small coke and fries, The other meal orders should be created by specifying different burgers, drink and
    side items.

3. You need a drink and a side item
    The drink should have a type, size and price, and the price for drink should change or each size.
    the side item needs at least a type and price

 4. You need burgers
    Every hamburger should have a burger type, a base price, and up to a maximum of three extra toppings
    The constructor should include only the burger type and price
    Extra toppings on the burger needs to be added somehow, and priced according to their type

 5. The deluxe burger bonus
    Create a deluxe burger meal, with a deluxe burger, that has a set price, so that any additional toppings do not
    change the price.
    The deluxe burger should have room for additional wo toppings

 6. Main method should have code to do the following
    Create a default meal, that uses no argument constructor
    Create a meal with a burger, the drink and the side item of your choice with up to 3 different extra toppings
    Create a meal with a deluxe burger, where all items, drink, side item and toppings up to 5 extra toppings are included
    in the burger price.

 7. For each eal order, youll want to perform these functions
    Add some additional toppings to the burger
    Change the size of the drink
    Print the itemized list. This should include the price of any burger, any extra toppings, the drink price based on
    size and side item price.

 */








public class Main {

    public static void main(String[] args) {

        //testing drink
        Item coke = new Item("Coke", "Drink",1.00);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        //testing toppings
        Item avocado = new Item("Avocado", "Topping", 1.50);
        avocado.printItem();


    }
}
