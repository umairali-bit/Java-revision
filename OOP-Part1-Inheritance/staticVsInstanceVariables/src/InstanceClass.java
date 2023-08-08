
class Dogs{

    private String name;

    public Dogs(String name){
        this.name = name;

    }
    public void printName(){
        System.out.println("name = " + name);
    }

}


public class InstanceClass {
    public static void main(String[] args) {
        Dogs rex = new Dogs("rex");
        Dogs fluffy = new Dogs ("fluffy");
        rex.printName();
        fluffy.printName();
    }

}
