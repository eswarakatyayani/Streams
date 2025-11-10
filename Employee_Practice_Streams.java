// EmployeesAboveSalary "50000"

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;
    String dept;

    Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String toString() {
        return name + " (" + dept + ", ₹" + salary + ")";
    }
}

public class EmployeesAboveSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(101, "Katyayani", 75000, "IT"),
            new Employee(102, "Ravi", 45000, "HR"),
            new Employee(103, "Om", 55000, "Finance")
        );

        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(System.out::println);
    }
}

/*
Answer:
Katyayani (IT, ₹75000.0)
Om (Finance, ₹55000.0)
*/
