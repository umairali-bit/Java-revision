package dev.lpa;


/*
1. Create a record named Employee, that contains FirstName, LastName, and hire date.
2. Setup a list of employees with various names and hire dates in the main method.
3. Setup a new method that takes this list of Employees as a parameter. Create a local class to wrap this class, (pass Employee to the constructor)
    and include a field for this) and add some calculated fields, such as full name and years worked.
4. Create a list of employees using your local class.
5. Create an anonymous class to sort your local class, by full name, or years worked
 */

import dev.lpa.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Harry", "Potter", "12/25/2025");
        Employee e2 = new Employee ("Hermoine", "Granger", "05/12/2019");
        Employee e3 = new Employee ("Darco", "Malfoy", "08/12/2003");


        List <Employee> list = new ArrayList<>(Arrays.asList(e1,e2,e3));

        printOrderedList(list, "name");
    }

    public static void printOrderedList (List <Employee> elist, String sortField) {

        int currentYear = LocalDate.now().getYear();

        class MyEmployee {

            Employee containedEmployee; // a reference to the Employee record
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(
                        containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        // creating a list of Myemployee

        List <MyEmployee> list = new ArrayList<>();
        for (Employee employee : elist) {

            list.add(new MyEmployee(employee));

        }

        //sorting it with two different ways

        var comparator = new Comparator<MyEmployee>() { //anonymous class

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {

                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (MyEmployee myEmployee : list) {
            System.out.println(myEmployee);
        }

    }


}
