
//base class

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    /*
    Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to the hamburger
    and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price.
    Remember that a name and price must be accepted as parameters in the first four methods so that the price of the
    hamburger is adjusted accordingly. These methods should be named addHamburgerAddition1, addHamburgerAddition2,
    addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger.
     The first four methods do not return values, but the last method does return the total price of the hamburger of
     type double, which includes the base price of the hamburger plus any additional items.
     */

    public void addHamburgerAddition1(String name, double price){
        addition1Name = name;
        addition1Price = price;

    }

    public void addHamburgerAddition2(String name, double price){
        addition2Name = name;
        addition2Price = price;

    }
    public void addHamburgerAddition3(String name, double price){
        addition3Name = name;
        addition3Price = price;

    }
    public void addHamburgerAddition4(String name, double price){
        addition4Name = name;
        addition4Price = price;

    }

    public double itemizeHamburger(){
        double hamburgerPrice = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll. Price is " + price);

        if(addition1Name != null){
            hamburgerPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }

        if(addition2Name != null){
            hamburgerPrice += addition2Price;
            System.out.println("Added" + addition2Name + " for an extra " + addition2Price);
        }

        if(addition3Name != null){
            hamburgerPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }

        if(addition4Name != null){
            hamburgerPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }

        return hamburgerPrice;
    }



















}
