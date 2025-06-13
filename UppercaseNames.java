java.util.*;
import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sita", "Krishna", "Radha", "Mohan", "Ali");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 4)      // More than 4 characters
                .map(String::toUpperCase)               // Convert to uppercase
                .collect(Collectors.toList());          // Collect into a list

        System.out.println("Filtered names: " + filteredNames);
    }
}