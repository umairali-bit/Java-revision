package dev.lpa;

/*
This class will contain a list containing duplicate names, then use a map to keep track of the counts
for each distinct name
 */

import java.util.ArrayList;
import java.util.List;

public class MainMailer {

    public static void main(String[] args) {

        String[] names = {"Ann Jones", "Ann Jones Ph.D.", "Bob Jones M.D.", "Carol Jones", "Ed Green Ph.D.",
                            "Ed Green M.D", "Ed Black"};

        List<StringBuilder> population = getNames(names);
        System.out.println(population);
    }

    //a static method that will create a random list of names
    private static List<StringBuilder> getNames(String[] names) {

        List<StringBuilder> list = new ArrayList<>();
        int index = 3;
        for (String name : names) {
            for (int i =0; i < index; i++) {
                list.add(new StringBuilder(name));
            }
            index++;
        }

        return list;


    }



}
