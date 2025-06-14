package PRACTICE;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        long num = scanner.nextInt();
        long original = num;
        long rem , ans = 0;

        while(num != 0)
        {
            rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }

        if(original == ans)
        System.out.println("Its Palindrome.");

        else
        System.out.println("Its not Palindrome.");
        
        scanner.close();

    }
    
}
