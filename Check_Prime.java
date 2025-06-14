//  Check whether a number is prime or not 

package PRACTICE;

import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = scanner.nextInt();

        if(num < 2)
        {
            System.out.println("Its not a prime number.");
            return ;
        }

        else
        {
        for(int i=2 ; i<num ; i++)
        {
          if(num % i == 0)
          { 
           System.out.println("Its not a prime number.");
           return ;
          }  
        }
       }
       
        System.out.println("Its a prime number.");

        scanner.close();
    }
    
}
