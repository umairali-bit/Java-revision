package dev.lpa;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String originalArray [] = new String[] {"First", "Second","Third"};
        var originalList = Arrays.asList(originalArray); //converting array into list

        originalList.set(0, "one");
        System.out.println("List : " +originalList);
        System.out.println("Arrays : " + Arrays.toString(originalArray));


        originalList.sort(Comparator.naturalOrder());
        System.out.println("Arrays : " + Arrays.toString(originalArray));

        /*
          cannot remove or add eleements to the list backed by an array

         */
        //originalList.remove(0);
        //originalList.add("fourth");

        List<String> newWeekList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newWeekList);

        /*
        Use of Arrays.asList
        Returned List is not resizable but mutable
         */

        var newList = Arrays.asList("Monday", "Tuesday", "Wednesday");

        String [] days = new String []{"Monday", "Tuesday", "Wednesday"};
        List<String> newDay = Arrays.asList(days);


        /*
        Use of List.of
        Returned list is immutable

         */
        var listOne = List.of("Thursday", "Friday", "Saturday");

        String [] week = new String [] {"Thursday", "Friday", "Saturday"};
        List<String> list = List.of(week);





    }
}
