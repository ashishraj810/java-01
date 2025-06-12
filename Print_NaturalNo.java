package PRACTICE;

import java.util.Scanner;

public class Print_NaturalNo {
    public static void main(String[] args) {
        
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt the user
        System.out.print("Enter an integer: ");

        // read integer input
        int number = scanner.nextInt();

        System.out.println("The natural numbers from 0 to " + number + " are :");

        for(int i=1 ; i<=number ; i++)
        {
            System.out.println(i);
        }

        // close the scanner
        scanner.close();
        
    }
    
}
