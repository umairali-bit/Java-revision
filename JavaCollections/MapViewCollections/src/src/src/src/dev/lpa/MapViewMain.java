package src.src.src.dev.lpa;

import java.util.HashMap;
import java.util.Map;

public class MapViewMain {

    public static void main(String[] args) {

        //creating a new map
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(),c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(),c));

        System.out.println(contacts);


    }
}
