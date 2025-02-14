package dev.lpa;


import java.util.HashMap;
import java.util.Map;

public class AdventureGame {


    public static final String GAME_LOCATIONS = """
            road	at the end of the road	 W: hill	 E:well house	S:valley	N:forest
            hill	on top of hill with a view in all directions	N:forest	 E:road		
            well house	inside a well house for a small spring	W:road	N:lake	S:stream	
            valley	in a forest valley beside a tumbling stream	N:road	W:hill	E:stream	
            forest	at the edge of a thick dark forest	S:road	E:lake		
            lake	by an alpine lake surrounded by wildflowers	W:forest	S:well house		
            stream	near a stream with a rocky bed	W:valley	 N:well house		
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
    }

    public AdventureGame(String customLocations) {
        
    }
}





