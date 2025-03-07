package src.src.src.dev.lpa;

import java.util.*;

public class MapViewMain {

    public static void main(String[] args) {

        //creating a new map
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(),c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(),c));

        System.out.println(contacts);

        // to get a view of my keys by the keySet method
        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

        // our key values are: [Lucy Van Pelt, Linus Van Pelt, Minnie Mouse, Maid Marion, Charlie Brown, Robin Hood, Daffy Duck, Mickey Mouse]

        // to get a sorted value of keys, we can use the tree set

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        // now we have sorted keys [Charlie Brown, Daffy Duck, Linus Van Pelt, Lucy Van Pelt, Maid Marion, Mickey Mouse, Minnie Mouse, Robin Hood]


        //searching by the key
        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");

            //Linus and I go way back, so of course I have info
        }
        contacts.forEach((k,v) -> System.out.println(v));

        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        contacts.forEach((k,v) -> System.out.println(v));
        // removed "Daffy duck" from the keysView and from the original map


        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(copyOfKeys);
        contacts.forEach((k,v) -> System.out.println(v));
        //removed "Linus Van Pelt" from the copyOfKeys but not from the original map


        // to retain deleted key from the original map
        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k,v) -> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);

        //we cannot use add to the Set, the following will give us an error
       // keysView.add("Daffy Duck");
      //  System.out.println(contacts);

        //to add elements to our set
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(),c ));
        System.out.println(keysView);

        // to print the values of a set
        var values = contacts.values();
        values.forEach(System.out::println);

        // changing anything in values view will also change in the keysView
        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k,v) -> System.out.println(v));

        System.out.println("-".repeat(50));
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));


        // adding a duplicate key under a different keyName
        System.out.println("-".repeat(50));
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        //passing values collection to a HashSet
        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if (set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate Values are in my map");
        }


        System.out.println("-".repeat(50));
        //entrySet

        var nodeSet = contacts.entrySet();
        for (var node: nodeSet) {
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println(nodeSet.getClass().getName());
                System.out.println("Key doesnt match name: " + node.getKey() + ": " + node.getValue());
            }
        }











    }
}
