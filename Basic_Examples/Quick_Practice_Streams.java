import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // Length of strings
        List<String> l = Arrays.asList("Kat", "Katy", "Katyayani");
        List<Integer> lengths = l.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
        System.out.println(lengths); // [3, 4, 10]

        // Even numbers
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = li.stream()
                                      .filter(n -> n % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4, 6]
    }
}
