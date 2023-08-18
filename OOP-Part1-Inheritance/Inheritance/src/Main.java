public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal ", " huge ", 400);
        doAnimalStuff(animal, " slow ");

        Dog dog = new Dog();
        doAnimalStuff(dog, " fast ");

        Dog yorkie = new Dog("yorkie ", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Lab", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever , " Slow " );
    }

    // static method because we want to call it from the main method
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");

    }
}
