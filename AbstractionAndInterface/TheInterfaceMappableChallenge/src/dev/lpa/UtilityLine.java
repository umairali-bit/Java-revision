package dev.lpa;

enum UtilityType {ELECTRICAL, FIBER_OPTICS, GAS, WATER}

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + "(" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTICS -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;


        };
    }
    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "type":"%s," """.formatted(name,type);
    }
}
