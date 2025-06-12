import java.util.*;
import java.util.stream.Collectors;

public class WordLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "cat", "elephant", "dog", "sun");

        List<Integer> lengths = words.stream()
                .map(String::length) // Convert each word to its length
                .collect(Collectors.toList());

        System.out.println("Lengths of words: " + lengths);
    }
}