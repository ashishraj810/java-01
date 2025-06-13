import java.util.*;

public class DivisibleBy7Check {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 14, 23, 35, 48, 60);

        boolean hasDivisibleBy7 = numbers.stream()
                .anyMatch(n -> n % 7 == 0); // Check if any number divisible by 7

        if (hasDivisibleBy7) {
            System.out.println("At least one number is divisible by 7.");
        } else {
            System.out.println("No number is divisible by 7.");
        }
    }
}