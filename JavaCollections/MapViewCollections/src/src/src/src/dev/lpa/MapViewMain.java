package src.src.src.dev.lpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }
}
