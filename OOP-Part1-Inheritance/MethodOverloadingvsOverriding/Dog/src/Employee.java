//overloading example

public class Employee {
    private static String name = "Tim";
    private static String name2 = "Jack";

    public void presentEmployee(){
        System.out.println(name + " is a present employee");
    }
    public static int presentEmployee(int number){
        for(int i = 0; i < number; i++){
            System.out.println(name2 + " is an employee");
        }
        return number;

    }
    public  static int  presentEmployee(String s, int number){
      return presentEmployee(8);

    }
}


