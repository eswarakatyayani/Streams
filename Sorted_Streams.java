//1. Ascending order 
import java.util.*;
import java.util.stream.*;

public class Q1_SortIntegersAscending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 8, 2, 9, 3);

        List<Integer> sortedAsc = nums.stream()
                .sorted()  // natural ascending order
                .collect(Collectors.toList());

        System.out.println("Ascending: " + sortedAsc);
    }
}

//2. Descending order
import java.util.*;
import java.util.stream.*;

public class Q2_SortIntegersDescending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 8, 2, 9, 3);

        List<Integer> sortedDesc = nums.stream()
                .sorted(Comparator.reverseOrder()) // descending order
                .collect(Collectors.toList());

        System.out.println("Descending: " + sortedDesc);
    }
}

//3.Strings Alphabetically (Ascending)

import java.util.*;
import java.util.stream.*;

public class Q3_SortStringsAscending {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Katyayani", "Anita", "Om");

        List<String> sortedAsc = names.stream()
                .sorted() // alphabetical order
                .collect(Collectors.toList());

        System.out.println("Ascending: " + sortedAsc);
    }
}

//4. Sort Strings in Descending Order
import java.util.*;
import java.util.stream.*;

public class Q4_SortStringsDescending {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Katyayani",  "Anita", "Om");

        List<String> sortedDesc = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending: " + sortedDesc);
    }
}
//5. Sort Employees by Salary (Ascending)
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " (₹" + salary + ")";
    }
}

public class Q5_SortEmployeesBySalaryAsc {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Ravi", 50000),
            new Employee(2, "Katyayani", 90000),
            new Employee(3, "Om", 70000)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

//6. Sort Employees by Salary (Descending)
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " (₹" + salary + ")";
    }
}

public class Q6_SortEmployeesBySalaryDesc {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Ravi", 50000),
            new Employee(2, "Katyayani", 90000),
            new Employee(3, "Om", 70000)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

//7.Sort Products by Name (Ascending, Ignore Case) 
import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " (₹" + price + ")";
    }
}

public class Q7_SortProductsByNameAsc {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 60000),
            new Product("mouse", 500),
            new Product("Chair", 2500)
        );

        List<Product> sorted = products.stream()
                .sorted(Comparator.comparing(p -> p.name.toLowerCase()))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

//8.Sort Products by Price (Descending) 

import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " (₹" + price + ")";
    }
}

public class Q8_SortProductsByPriceDesc {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 60000),
            new Product("Mouse", 500),
            new Product("Chair", 2500)
        );

        List<Product> sortedDesc = products.stream()
                .sorted(Comparator.comparingDouble((Product p) -> p.price).reversed())
                .collect(Collectors.toList());

        sortedDesc.forEach(System.out::println);
    }
}

