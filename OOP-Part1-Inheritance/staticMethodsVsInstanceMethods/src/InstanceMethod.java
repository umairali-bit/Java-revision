public class InstanceMethod {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.bark();
    }
}
class Dog{
    public void bark(){
        System.out.println("woof");
    }
}