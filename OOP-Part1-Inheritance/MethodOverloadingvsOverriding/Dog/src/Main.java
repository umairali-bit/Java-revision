public class Main {
    public static void main(String[] args) {
        germanShepherd jack = new germanShepherd();
        jack.bark();

        Dog mozzarelle = new Dog();
        mozzarelle.bark();

        Employee tim = new Employee();
        tim.presentEmployee();
        tim.presentEmployee(5);
        tim.presentEmployee("s", 8);

    }
}
