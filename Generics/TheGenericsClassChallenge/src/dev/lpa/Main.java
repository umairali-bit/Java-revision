package dev.lpa;

public class Main {


    public static void main(String[] args) {

        var nationalUSParks = new Park[] {
                new Park ("Yellowstone", "44.4882, -110.5916"),
                new Park ("Grand Canyon", "36.1085, -112.0965"),
                new Park ("Yosemti", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[] {
                new River("Mississippi","12345, -1234.23", "29.144, -89.249", "35.15, -90.23"),
                new River("Missouri", "45.943, -111.4983", "38.814, -90.1219")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(
                new River("Colorado","40.4708, -105.8286"));

        riverLayer.renderLayer();
    }


}


