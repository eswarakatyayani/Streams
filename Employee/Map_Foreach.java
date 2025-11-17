import java.util.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class MapEmployeeForEach {
    public static void main(String[] args) {

        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee("Om", 45000));
        empMap.put(2, new Employee("Katyayani", 95000));
        empMap.put(3, new Employee("Ravi", 65000));

        // ----------------------------
        // 1. Using forEach(key, value)
        // ----------------------------
        System.out.println("Using forEach(key, value):");
        empMap.forEach((id, emp) ->
            System.out.println("ID: " + id + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary())
        );

        // ----------------------------
        // 2. Using entrySet().forEach()
        // ----------------------------
        System.out.println("\nUsing entrySet().forEach():");
        empMap.entrySet().forEach(entry ->
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() + ", Salary: " + entry.getValue().getSalary())
        );

        // ----------------------------
        // 3. Using keySet().forEach()
        // ----------------------------
        System.out.println("\nUsing keySet().forEach():");
        empMap.keySet().forEach(id -> {
            Employee emp = empMap.get(id);
            System.out.println("ID: " + id + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary());
        });

        // ----------------------------
        // 4. Using values().forEach()
        // ----------------------------
        System.out.println("\nUsing values().forEach():");
        empMap.values().forEach(emp ->
            System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary())
        );
    }
}
