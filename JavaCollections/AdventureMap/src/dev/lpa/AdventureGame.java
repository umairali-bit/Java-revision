package dev.lpa;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventureGame {


    public static final String GAME_LOCATIONS = """
            road,at the end of the road,W: hill,E:well house,S:valley,N:forest
            hill,on top of hill with a view in all directions,N:forest,E:road		
            well house,inside a well house for a small spring,W:road,N:lake,S:stream	
            valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream	
            forest,at the edge of a thick dark forest,S:road,E:lake		
            lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house		
            stream,near a stream with a rocky bed,W:valley, N:well house				
            """;

    private enum Compass {

        E, N, S, W;

      private static String[] directions = {"East", "North", "South", "West"};

      private String getString() {
          return directions [this.ordinal()]; //this will take E as East, N as North, S as South and W as West

        }
      }

      /*
    location record, a nested type record with description, and a map called nextPlaces, This method will be keyed by
    the compass
       */
    private record Location (String description, Map<Compass, String> nextPlaces) {}


    //two fields on the adventure game, 1 to keep track of my last location and 2 for board locations
    private String lastPlace;
    private Map<String, Location> adventureMap = new HashMap<>();

    public AdventureGame() {
        this(null);

    }

    //to have the players the ability to customize the map
    public AdventureGame(String customLocations) {
        loadLocations(GAME_LOCATIONS);

        if (customLocations != null) {
            loadLocations(customLocations);
        }
    }

    private void loadLocations(String data) {

        for (String s : data.split("\\R")) { //splitting the text block by each line, by escape sequence

            String[] parts = s.split(",", 3); //splitting the line by , and in 3 parts

            //this part will contain all the data after the second comma, and it will include commas if any
            Arrays.asList(parts).replaceAll(String::trim);//getting rid of any white spaces

            //creating each Location record, I created a nextPlaces map.

            Map <Compass, String> nextPlaces = loadDirections(parts[2]);
            Location location = new Location(parts[1], nextPlaces);
            adventureMap.put(parts[0], location);

        }

        adventureMap.forEach((k,v) -> System.out.printf("%s:%s%n", k, v));
    }

    private Map<Compass, String> loadDirections(String nextPlaces) {

        Map<Compass, String> directions = new HashMap<>();
        List<String> nextSteps = Arrays.asList(nextPlaces.split(","));
        for (String nextPlace : nextSteps) {
            String[] splits = nextPlace.split(":");
            Compass compass = Compass.valueOf(splits[0].trim());
            String destination = splits[1].trim();
            directions.put(compass, destination);
        }

        nextSteps.replaceAll(String::trim);

        return directions;

    }




}





