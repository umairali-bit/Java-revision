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


       List<StringBuilder> cleanedNames = standardizeNames(population);
       System.out.println(cleanedNames);

        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd); // this will give null

        System.out.println(counts); // all suffixes are gone

        StringBuilder annJones = new StringBuilder("Ann Jones");
        System.out.println("There are " + counts.get(annJones) + " records for " + annJones); // it will give 4 records

        System.out.println("-".repeat(50));
        counts.forEach((k,v) -> System.out.println(k + " : " + v)); //to get each entry and each count

        //lets loop through the keySet
        System.out.println("-".repeat(50));
        counts.keySet().forEach((k) -> System.out.println(k + " : " + counts.get(k)));
        






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
            //looping through possible suffixes
            for (String suffix : new String[]{"Ph.D.","M.D."}) {
                //a local variable to hold an index
                int startIndex = -1;
                //to check if the sufix is present. If its greater than -1, there is a matching suffix
                if ((startIndex = name.indexOf(suffix)) > -1 ) {
                    //replacing the suffix with an empty string
                    name.replace(startIndex -1, startIndex + suffix.length(), "");

                }
            }
            //adding names without the suffix to newList
            newList.add(name);
        }

        return newList;
    }



}
