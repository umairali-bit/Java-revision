package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        //creating a list
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("New Mexico");

        System.out.println(placesToVisit);

        addingElementsStack(placesToVisit);
        System.out.println(placesToVisit);


        removingElementsStack(placesToVisit);
        System.out.println(placesToVisit);


        addingElementsQueue(placesToVisit);
        System.out.println(placesToVisit);

        removingElementsQueue(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);//Retrieved element at index 4 = Virginia

        queueRetrieval(placesToVisit);

        stackRetrieval(placesToVisit);

        System.out.println(placesToVisit);
        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);


    }

    private static void addingElementsStack(LinkedList<String> list){

        list.push("New york");
        list.push("Florida");
        list.push("California");
        list.push("Arizona");


    }

    private static void removingElementsStack(LinkedList<String> list){
        //removing Arizona from the list
        String p1 = list.pop();
        System.out.println(p1 + " was removed");
    }

    private static void addingElementsQueue(LinkedList<String> list){
        //double ended queue
        list.offerFirst("Maine");
        list.offerLast("Virginia");
    }

    private static void removingElementsQueue(LinkedList<String> list){


        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list){


        System.out.println("Retrieved element at index 4 = " + list.get(4));

        System.out.println("First element = " + list.getFirst());//First element = California
        System.out.println("Last element = " + list.getLast());//Last element = Virginia

        //to get the index of an element
        System.out.println("New york is at position = " + list.indexOf("New york"));
        System.out.println("Virginia is at position = " + list.lastIndexOf("Virginia"));
    }

    private static void queueRetrieval(LinkedList<String> list){
        //Queue is First in First out
        System.out.println("Element from element() = " + list.element());//retrieve the first element in the queue

    }

    private static void stackRetrieval(LinkedList<String> list){

        //stack is LIFO, last in and first out
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

        System.out.println();

    }

    private static void printItinerary(LinkedList<String> list){

        System.out.println("Trip 1 starts at = " + list.getFirst());
        for (int i = 1; i <list.size(); i++){
            //(i-1) gives the last index (i) gives the current
            System.out.println("---> " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at = " + list.getLast());


    }
    private static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip 2 starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("-----> From : " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at = " + list.getLast());


    }

    //using list iterator

    private static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip 3 starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("-----> From : " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at = " + list.getLast());


    }



}
