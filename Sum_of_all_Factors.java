// Find sum of all factors of a given number 

package PRACTICE;

import java.util.Scanner;

public class Sum_of_all_Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = scanner.nextInt();
        int ans = 0;

        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            ans+=i;
        }
        System.out.println("Sum of all the factors is " + ans);
        scanner.close();
    }
    
}
