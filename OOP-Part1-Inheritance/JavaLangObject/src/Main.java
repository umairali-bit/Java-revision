public class Main extends Object{

    public static void main(String[] args) {
        Student max = new Student("MAX", 25);
        System.out.println(max.toString());
        //Student@7a81197d. prints name of the class "Student" and hashcode of the object "7a81197d"
        // hashcode is an integer which is unique to an instance.Its a mechanisim for instance

    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
