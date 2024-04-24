package dev.lpa;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable{

    private String name;
    private UsageType usage;


    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + "(" + usage + ")";    //it will print usage of the building, entertainment, sports etc from enum
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;      //Just need to return Point from the Geometry enum
    }

    @Override
    public String getMarker() {

        //setup map icons determined by the building type both for their color and shape using enhanced switch statement
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }
}
