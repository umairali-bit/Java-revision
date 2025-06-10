package dev.lpa.vector;

import dev.lpa.DeepDrive.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Harry","Potter", 123));
        employeeList.add(new Employee("Ron","Weasley", 223));
        employeeList.add(new Employee("Lord","Voldemort", 323));
        employeeList.add(new Employee("Hermione","Granger", 423));


        employeeList.forEach(i -> System.out.println(i));
        System.out.println(employeeList.get(0));
        System.out.println(employeeList.isEmpty());

        employeeList.set(3, new Employee("Sirius", "Black", 423));
        employeeList.forEach(i -> System.out.println(i));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Hermione","Granger", 423));
        employeeList.forEach(i -> System.out.println(i));
        System.out.println("-".repeat(30));

        //  backing array
        Employee[] employeeArray = employeeList.toArray(employeeList.toArray(new Employee[employeeList.size()]));

        for (Employee employee : employeeArray) {
            System.out.println(employee);

        }

        System.out.println(employeeList.contains(new Employee("Lord","Voldemort", 323)));
        System.out.println(employeeList.indexOf(new Employee("Harry", "Potter", 123)));

        employeeList.remove(2);
        employeeList.forEach(i -> System.out.println(i));



    }
}

