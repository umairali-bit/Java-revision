public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal ", " huge ", 400);
        doAnimalStuff(animal, " slow ");

        Dog dog = new Dog();
        doAnimalStuff(dog, " fast ");

        Dog yorkie = new Dog("yorkie ", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Lab", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever , "slow" );

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie= new Fish("Gold fish", 0.25,2,3);
        doAnimalStuff(goldie, "fast");
    }

    // static method because we want to call it from the main method
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");

    }
}
