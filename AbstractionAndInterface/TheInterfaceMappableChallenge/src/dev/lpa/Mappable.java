package dev.lpa;

enum Geometry {LINE, POINT, POLYGON}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s}""";    //%s is a specifier for format of string


    //three abstract methods that return a label geometry type, and a map icon

    String getLabel();
    Geometry getShape();    //returns an enum type
    String getMarker();      //getMarker is a map icon

    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());

    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }



}
