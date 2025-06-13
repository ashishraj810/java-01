
import java.util.*;

public class CountAStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "banana", "Avocado", "apricot", "Mango", "almond", "Berry");

        long count = names.stream()
                .filter(name -> name.toLowerCase().startsWith("a")) // Check if starts with 'a' or 'A'
                .count(); // Count matching items

        System.out.println("Count of strings starting with 'A' or 'a': " + count);
    }
}