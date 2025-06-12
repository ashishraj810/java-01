    //  Find sum of all digits of a given number

package PRACTICE;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired number :" );

        int num = scanner.nextInt();
        int rem;
        int ans=0;

        while(num > 0)
        {
            rem = num % 10;
            ans += rem;
            num = num / 10;
        }

        System.out.println("Sum of digits of given number is : " + ans);
        scanner.close();
    }

    
}
