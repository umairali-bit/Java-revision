package dev.lpa;

/*
This class will contain a list containing duplicate names, then use a map to keep track of the counts
for each distinct name
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {

    public static void main(String[] args) {

        String[] names = {"Ann Jones", "Ann Jones Ph.D.", "Bob Jones M.D.", "Carol Jones", "Ed Green Ph.D.",
                            "Ed Green M.D", "Ed Black"};

        List<StringBuilder> population = getNames(names);
        System.out.println(population);

        // setting up a map of the counts of duplicate names, the key will be a StringBuilder and the value is going
        // to be an integer

        Map<StringBuilder, Integer> counts = new TreeMap<>();
        population.forEach(s-> {
            counts.merge(s, 1, Integer::sum); //Lets us add a new name with a value of 1 or increment the value that already in the map

        });
        System.out.println(counts);

        //getting the number of Ann Jones Ph.Ds
        StringBuilder annJonesPhd = new StringBuilder("Ann Jones Ph.D.");
        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd);
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


    //mailing a flyer to this population. remove suffixes before printing the name
    private static List<StringBuilder> standardizeNames (List<StringBuilder> list) {

        // setting up a new arraylist
        List<StringBuilder> newList = new ArrayList<>();

        //loop through the list passed as a method argument
        for (var name: list) {

        }

        return newList;
    }



}
