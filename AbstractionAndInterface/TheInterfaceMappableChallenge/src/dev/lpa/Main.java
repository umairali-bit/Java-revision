package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List<Mappable> mappables = new ArrayList<>();  //coding to an Interface, anything mappable can be added to this list

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));
        mappables.add(new UtilityLine("College st", UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
