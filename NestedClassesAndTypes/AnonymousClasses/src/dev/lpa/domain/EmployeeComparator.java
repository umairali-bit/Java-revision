
package dev.lpa.domain;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {
    public EmployeeComparator() {
    }

    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}




