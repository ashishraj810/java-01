    // Print sum of n naturnal no 

package PRACTICE;

import java.util.Scanner;

public class Sum_of_Natural_no {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        
         
        int num = scanner.nextInt();
        int ans = 0; 
        

        for(int i = 1 ; i<=num ; i++)
        {
            ans+=i;
        }
        System.out.println("The sum is :" + ans);

        scanner.close();
    }
    
}
