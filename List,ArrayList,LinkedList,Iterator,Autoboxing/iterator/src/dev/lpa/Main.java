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
        printItinerary3(placesToVisit);

        testIterator(placesToVisit);

        iterateRemoveElement(placesToVisit);

        listIterateRemoveElement(placesToVisit);


    }

    private static void addingElementsStack(LinkedList<String> list){

        list.push("New York");
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
        System.out.println("New york is at position = " + list.indexOf("New York"));
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

    //using iterator

    private static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip 3 starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);//to start iterating form index 1
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("-----> From : " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at = " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list){

        //creating a variable iterator
        var iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); // prints out the next element
        }
        System.out.println(list);
    }

    private static void iterateRemoveElement(LinkedList<String> list){

        //creating a variable iterator
        var iterator = list.iterator();
        while(iterator.hasNext()){

            //iteration to remove New york from the list

            if(iterator.next().equals("New York")){
                iterator.remove();
            }

        }
        System.out.println(list);
    }

    private static void listIterateRemoveElement(LinkedList<String> list){

        //creating a variable iterator
        var iterator = list.listIterator();
        while(iterator.hasNext()){

            //iteration to remove New york from the list

            if(iterator.next().equals("New Mexico")){
                iterator.add("Philadelphia");//add philadelphia after New Mexico
            }

        }
        //because of the cursor position it cant move forward
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        //to get the element we need to set the cursor at the element
        var iterator2 = list.listIterator(3);
        // System.out.println(iterator2.next());//Philadelphia
        System.out.println(iterator2.previous());//New Mexico
        System.out.println(list);
    }

}

