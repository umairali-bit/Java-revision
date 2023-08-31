public class BedRoom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;



    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling,Bed bed,Lamp lamp ) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
         bed.make();
    }
}
