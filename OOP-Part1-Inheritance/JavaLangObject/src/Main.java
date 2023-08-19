public class Main extends Object{

    public static void main(String[] args) {
        Student max = new Student("MAX", 25);
        //System.out.println(max.toString());
        System.out.println(max);
        //Student@7a81197d. prints name of the class "Student" and hashcode of the object "7a81197d"
        // hashcode is an integer which is unique to an instance.Its a mechanisim for instance

        primarySchoolStudent jimmy = new primarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*

    @Override
    public String toString(){
        return super.toString(); //its reduntant code because hashcode is coming from the Object class
    }

     */

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class primarySchoolStudent extends Student{
    private String parentName;

    primarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }

}
