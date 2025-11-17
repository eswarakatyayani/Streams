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

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(101, "Katyayani", 75000, "IT"),
            new Employee(102, "Ravi", 45000, "HR"),
            new Employee(103, "Om", 55000, "Finance"),
            new Employee(104, "Omkar", 55000, "Finance")
        );
// PROBLEM 1: Salary greater than 50000
         List<Employee> emp=employees.stream()
                  .filter(e->e.salary>50000)
                  .collect(Collectors.toList());
        System.out.println(emp);
       
        System.out.println("____________________________________");
//PROBLEM 2: employee grouped by department
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept));

        grouped.forEach((dept, list) -> {
            System.out.println(dept + ":");
            list.forEach(em -> System.out.println("  " + em.name));
        });
        System.out.println("____________________________________");
//PROBLEM 3: Find highest-paid employee in each department   
        Map<String,Optional<Employee>> emp1= employees.stream()
                 .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))));
       
        emp1.forEach((dept, optEmp) ->
    System.out.println(dept + ":" + optEmp.map(e->e.name).orElse("No employee"))
);
System.out.println("____________________________________");
//PROBLEM 4: Calculate average salary by department
          Map<String,Double> avgsal = employees.stream()
                           .collect(Collectors.groupingBy(e->e.dept,Collectors.averagingDouble(e->e.salary)));
                           
                          avgsal.forEach((dept,sal) ->
                           System.out.println(dept+": "+sal));
 
System.out.println("____________________________________");

    }
}
