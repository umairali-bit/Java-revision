package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //ArrayList capacity in creation

        ArrayList<Integer> intList = new ArrayList<>(10);
        for(int i = 0; i<7; i++){
            intList.add((i + 1)*5);
        }
        intList.add(40);
        intList.add(50);
        intList.add(55);

        intList.add(60); //This add exceeds the ArrayList capacity. java will allocate more memory and greater capacity
        System.out.print(intList);

    }
}
