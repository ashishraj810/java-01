// print all even numbers between the given range 

package PRACTICE;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int number2 = scanner.nextInt();

        System.out.println("All even numbers between " + number1 + " and " + number2 + " are : " );
         for(int i = number1 ; i <= number2 ; i++)
         {
            if(i % 2 == 0)
            System.out.println(i);
         }
        scanner.close();
    }
    
}
