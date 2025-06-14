// Check whether a number is perfect or not 

package PRACTICE;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int ans = 0;

        for(int i = 1 ; i < num ; i++)
        {
            if(num % i == 0)
            {
                ans += i;
            }
        }

        if(ans == num)
        System.out.println("Its a perfect number.");
        else
        System.out.println("Its not a perfect number.");

        scanner.close();
    }

    
}
