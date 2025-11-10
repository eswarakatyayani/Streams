

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
}

public class Q2_GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Ravi", 60000, "IT"),
            new Employee(2, "Katyayani", 80000, "IT"),
            new Employee(3, "Anita", 50000, "HR"),
            new Employee(4, "Om", 40000, "Finance")
        );

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept));

      /* 
      output at this stage:
      {
  "IT" = [Employee(1, "Ravi", 60000, "IT"), Employee(2, "Katyayani", 80000, "IT")],
  "HR" = [Employee(3, "Anita", 50000, "HR")],
  "Finance" = [Employee(4, "Om", 40000, "Finance")]
    }
     */

        grouped.forEach((dept, list) -> {  // grouped is map so dept is String and list is list of employee they are just variable names
            System.out.println(dept + ":");
            list.forEach(emp -> System.out.println("  " + emp.name));
        });
/*
Finance:
  Om
HR:
  Anita
IT:
  Ravi
  Katyayani

*/      
    }
}
