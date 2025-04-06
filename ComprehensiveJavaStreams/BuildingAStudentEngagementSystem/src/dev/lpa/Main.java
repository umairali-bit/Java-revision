package dev.lpa;

public class Main {

    public static void main(String[] args) {


        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");
        Student joe = new Student("US",2019,30,"M",true,
                pymc, jmc);
        System.out.println(joe);

    }
}
