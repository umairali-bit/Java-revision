package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    /*
    it has three fields. One String called name and Two ints called hitPoints and strength.
     */

    private String name;
    private int hitPoints;
    private int strength;

    /*
    A constructor that accepts a String (name) and two ints (hitPoints and strength).
    It initialises name, hitPoints and strength with the newly passed in values.
     */

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    /*
    Only getters for the three fields.
     */

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    /*
    write(), same as interface. Return a List of the fields in the order they appear in toString().
    */

    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        return values;
    }

    /*
    read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List
    is not null and the size() is greater than 0 before storing the values.
     */

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }

    }

        /*
    toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:
    Monster{name='Werewolf', hitPoints=20, strength=40}
     */

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }


}
