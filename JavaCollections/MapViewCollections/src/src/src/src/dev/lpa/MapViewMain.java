package src.src.src.dev.lpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
    }
}
