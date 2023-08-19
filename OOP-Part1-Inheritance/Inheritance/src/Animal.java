public class Animal {

    protected String type;
    private String size;
    private double weight;

    //empty constructor

    public Animal(){

    }

    // constructor with fields
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //toString() from the Object class
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }


    public void move (String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise (){
        System.out.println(type + " make some kind of noise ");
    }



}

