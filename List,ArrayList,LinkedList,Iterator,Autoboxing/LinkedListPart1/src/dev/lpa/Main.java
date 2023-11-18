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
        System.out.println(placesToVisit); //[Darwin, Canberra, Sydney, Hobart]

    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");
    }




}
