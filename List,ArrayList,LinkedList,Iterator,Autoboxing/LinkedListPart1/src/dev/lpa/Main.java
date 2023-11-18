package dev.lpa;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {



       // LinkedList<String> placesToVisit = new LinkedList<>(); //declaring a LinkedList

        var placesToVisit = new LinkedList<String>(); //declaring a linkedList using var keyword

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);//[Canberra, Sydney]

        addMoreElements(placesToVisit); //passing placesToVisit list into addMoreElements();
        System.out.println(placesToVisit); //[Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

        removeElements(placesToVisit);
        System.out.println(placesToVisit);//[Alice Springs, Darwin, Canberra, Hobart, Melbourne, Toowoomba]

    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Melbourne");
        /*
        double ended queue
         */
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //stack methods
        list.push("Alice Springs");//[Alice Springs, Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");


        //additional methods that are used to remove elements in LinkedList
        //no argument remove method
        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println(s1 + " was removed"); //Alice Springs was removed

        String s2 = list.removeFirst(); // also removes first element
        System.out.println(s2 + " was removed"); //Darwin was removed

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");//Toowoomba was removed



    }




}
