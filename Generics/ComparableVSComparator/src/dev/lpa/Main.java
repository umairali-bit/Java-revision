package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};

        for(Integer i : others) {
            int val = five.compareTo(i);

            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val<0) ? "<" :">"), i, val);
        }

        String banana = "banana";
        String[] fruits = {"apples","pears","banana","BANANA"};

        for(String s : fruits ) {
            int val = banana.compareTo(s);

            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val<0) ? "<" :">"), s, val);





        }

        //sorting
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("A:" +(int) 'A' + " " + "a:"+(int)'a');
        System.out.println("B:" +(int) 'B' + " " + "B:"+(int)'b');
        System.out.println("P:" +(int) 'P' + " " + "p:"+(int)'p');



        Student tim = new Student("Tim");
        Student [] students = { new Student ("Zach"),
                                new Student ("Tim"),
                                new Student ("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //System.out.println("result = " + tim.compareTo("Marry")); compare to object is trying to compare a String and an object


        Students Tim = new Students("Tim");
        Students [] studentss = { new Students ("Zach"),
                new Students ("Tim"),
                new Students ("Ann")};

        Arrays.sort(studentss);
        System.out.println(Arrays.toString(studentss));

        System.out.println("result = " + Tim.compareTo(new Students("tim")));



        Comparator<Students> gpaSorter = new StudentsGPAComparator();
        Arrays.sort(studentss, gpaSorter.reversed());
        System.out.println(Arrays.toString(studentss));


    }
}



class Student implements Comparable{

    private String name;

    public Student (String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;

        return name.compareTo(other.name);
    }





}


class StudentsGPAComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Students implements Comparable <Students> {


    private static int LAST_ID = 1000;
    private static Random random = new Random();

    protected String name;
    private int id;
    protected double gpa;


    public Students (String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Students o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
