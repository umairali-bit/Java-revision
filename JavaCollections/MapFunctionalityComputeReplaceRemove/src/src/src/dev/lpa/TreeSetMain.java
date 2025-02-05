package src.src.dev.lpa;

import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");


        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        //need to pass comparator
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        //trees have natural sort order
        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);


        //The fullSet set has the sorted mechanism of TreeSet passed to the constructor
        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        //There is a method on the SortedSet Interface that returns a comparator "sorted" used in the set
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("-".repeat(10));
//        for (Contact contact : fullList) {
//            System.out.println(contact);
//        }
        fullList.forEach(System.out::println);


            //min and max on trees
//        Contact min = Collections.min(fullSet);
//        Contact max = Collections.max(fullSet);

        // The above two methods wont compile because of comparator is not used in Trees
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        //SortedInterface also includes first and last methods, which could be a substitute of min and max
        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("-".repeat(9));

        System.out.printf("min = %s, first = %s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last = %s %n", max.getName(), last.getName());

        /*
        min = Charlie Brown, first = Charlie Brown
        max = Robin Hood, last = Robin Hood
         */

        System.out.println("-".repeat(9));

        //pollFirst and pollLast removes the 1st and the last sorted element from the set

        //create a copy of the set
        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());

        copiedSet.forEach(System.out::println);
        System.out.println("-".repeat(9));

        Contact daffy = new Contact("Daffy Duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("snoopy");
        Contact archie = new Contact("Archie");


        //ceiling returns the element that is either greater than or equal to the elements passed
        //higher returns the value that equal to it in a set. It returns the next greater element.
        for (Contact c: List.of(daffy, daisy, snoopy)) {
            System.out.printf("ceiling(%s)=%s%n", c.getName(),fullSet.ceiling(c));
            System.out.printf("higher(%s)=%s%n", c.getName(),fullSet.higher(c));

        }
        System.out.println("-".repeat(30));

        /*
        ceiling(Daffy Duck)=Daffy Duck: [daffy@google.com] []
        higher(Daffy Duck)=Linus Van Pelt: [lvpelt2015@gmail.com] []
        ceiling(Daisy Duck)=Linus Van Pelt: [lvpelt2015@gmail.com] []
        higher(Daisy Duck)=Linus Van Pelt: [lvpelt2015@gmail.com] []
        ceiling(snoopy)=null
        higher(snoopy)=null
        ------------------------------
         */



        for (Contact c: List.of(daffy, daisy, first, archie)) {//full.first()
            System.out.printf("floor(%s)=%s%n", c.getName(),fullSet.floor(c));
            System.out.printf("lower(%s)=%s%n", c.getName(),fullSet.lower(c));

        }
        System.out.println("-".repeat(30));


        NavigableSet<Contact> descendingSet = fullSet.descendingSet();
        descendingSet.forEach(System.out::println);//to print each and every element in the set
        System.out.println("-".repeat(30));

        //checking if the fullset has been changed. It did
        Contact lastContact = descendingSet.pollLast();
        System.out.println("Removed " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println("-".repeat(30));
        fullSet.forEach(System.out::println);
        System.out.println("-".repeat(30));


        //Creating a new name and getting subset from the head or beginning of the SortedSet,
        // or the tail or end of the SortedSet.
        Contact marion = new Contact("Maid Marion");
        var headSet = fullSet.headSet(marion, true);
        fullSet.forEach(System.out::println);
        System.out.println("-".repeat(30));
        headSet.forEach(c -> System.out.println("HeadSet: " + c));
        System.out.println("-".repeat(30));

        /*
            HeadSet: Daffy Duck: [daffy@google.com] []
            HeadSet: Linus Van Pelt: [lvpelt2015@gmail.com] []
            HeadSet: Lucy Van Pelt: [] [(564) 208-6852]
            HeadSet: Maid Marion: [] [(123) 456-7890]

         */

        var tailSet = fullSet.tailSet(marion, false);
        tailSet.forEach(c-> System.out.println("tailSet: " + c));
        System.out.println("-".repeat(30));


        /*
        tailSet: Mickey Mouse: [] [(999) 888-7777]
        tailSet: Minnie Mouse: [] [(456) 780-5666]
        tailSet: Robin Hood: [] [(564) 789-3000]
         */

        //subset includes the first element but not the second
        Contact linus = new Contact("Linus Van Pelt");
        var subset = fullSet.subSet(linus, marion);
        subset.forEach(System.out::println);

        /*
        Linus Van Pelt: [lvpelt2015@gmail.com] []
        Lucy Van Pelt: [] [(564) 208-6852]
         */







    }
}
