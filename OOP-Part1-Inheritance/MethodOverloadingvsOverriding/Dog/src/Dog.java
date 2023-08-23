//Overriding example

public class Dog {


    public void bark() {

        System.out.println("Woof");
    }
}

class germanShepherd extends Dog{
    @Override
    public void bark(){
        System.out.println("Woof Woof Woof");
    }
}
