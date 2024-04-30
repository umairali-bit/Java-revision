package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Player tim = new Player("Tim", 1, 2);
        System.out.println(tim.toString());
        tim.setHitPoints(8);
        tim.setStrength(20);
        System.out.println(tim);
        System.out.println(tim.getHitPoints());
        saveObject(tim);


        ISaveable werewolf = new Monster("Werewolf", 20, 10);
        saveObject(werewolf);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength() );



    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

}
