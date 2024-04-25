package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    /*
    Player class has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.
     */


    private String name;
    private String weapon;


    private int hitPoints;
    private int strength;


    /*
    A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and
    strength with the newly passed in values. It initialises weapon with the default weapon "Sword".
     */

    public Player(String name, int hitPoints, int strengths) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strengths;
        this.weapon = "Sword";

        }

        /*
        getters and setters
         */

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrengths(int strengths) {
        this.strength = strengths;
    }

    /*
    toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:
    Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
     */

    @Override
    public String toString(){
        return "Player {" +
                "name='" + name + '\''+
                " , hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                "}";
    }

    /*
    write(), same as interface. Return a List of the fields in the order they appear in toString().
     */


    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    /*
    read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure 
    the List is not null and the size() is greater than 0 before storing the values.
     */

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this. strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }

    }
}
