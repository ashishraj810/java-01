    // Find all the factors of a given number 

package PRACTICE;

import java.util.Scanner;

public class FActors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        System.out.println("The factors are : ");

        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            System.out.println( i);
        }
        scanner.close();
    }
    
}
