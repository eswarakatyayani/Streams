// Get list of employee names sorted by salary descending

//Method 1
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

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Om", 45000, "IT"),
            new Employee(2, "Katyayani", 95000, "IT"),
            new Employee(3, "Ravi", 65000, "HR")
        );

        List<String> sortedNames = employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .map(e -> e.name)
                .toList();

        System.out.println(sortedNames);
    }
}

//Method 2
/*
can use a Map<key, value>, store employees as (name, salary) pairs, then sort them by salary descending, and finally collect the names in sorted order.
*/

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
 
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Om", 45000, "IT"),
            new Employee(2, "Katyayani", 95000, "IT"),
            new Employee(3, "Ravi", 65000, "HR")
        );
 
        // Map with key=name, value=salary
        Map<String, Double> map = employees.stream()
                .collect(Collectors.toMap(e -> e.name, e -> e.salary));
 
        // Sort map entries by value (salary) desc → extract names
        List<String> sortedNames = map.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();
 
        System.out.println(sortedNames);
    }
}

//o/p: [Katyayani, Ravi, Om]
