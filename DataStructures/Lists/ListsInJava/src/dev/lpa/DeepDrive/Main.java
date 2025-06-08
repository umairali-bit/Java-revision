package dev.lpa.DeepDrive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harry","Potter", 123));
        employeeList.add(new Employee("Ron","Weasley", 223));
        employeeList.add(new Employee("Lord","Voldemort", 323));
        employeeList.add(new Employee("Hermione","Granger", 423));


        employeeList.forEach(i -> System.out.println(i));
        System.out.println(employeeList.get(0));
        System.out.println(employeeList.isEmpty());

        employeeList.set(3, new Employee("Sirius", "Black", 423));
        employeeList.forEach(i -> System.out.println(i));



    }
}
