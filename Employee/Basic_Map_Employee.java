import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class MapEmployeeExample {
    public static void main(String[] args) {

        // Map: key = employee id, value = employee object
        Map<Integer, Employee> empMap = new HashMap<>();

        // Adding entries
        empMap.put(1, new Employee("Om", 45000));
        empMap.put(2, new Employee("Katyayani", 95000));
        empMap.put(3, new Employee("Ravi", 65000));

        // -------------------------------------------
        // 1. forEach(key, value)
        // -------------------------------------------
        System.out.println("Using forEach(key, value):");
        empMap.forEach((id, emp) -> {
            System.out.println("ID: " + id + ", Name: " + emp.name + ", Salary: " + emp.salary);
        });


        // -------------------------------------------
        // 2. Using entrySet()
        // -------------------------------------------
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() +
                               ", Name: " + entry.getValue().name +
                               ", Salary: " + entry.getValue().salary);
        }

        // -------------------------------------------
        // 3. Using keySet()
        // -------------------------------------------
        System.out.println("\nUsing keySet():");
        for (Integer id : empMap.keySet()) {
            Employee emp = empMap.get(id);
            System.out.println("ID: " + id +
                               ", Name: " + emp.name +
                               ", Salary: " + emp.salary);
        }


        // -------------------------------------------
        // 4. Using values()
        // -------------------------------------------
        System.out.println("\nUsing values():");
        for (Employee emp : empMap.values()) {
            System.out.println("Employee: " + emp.name + ", Salary: " + emp.salary);
        }
    }
}
