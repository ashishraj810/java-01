//   find product of natural number 

package PRACTICE;

import java.util.Scanner;

public class Prdt_of_NaturalNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int ans = 1;

        for(int i=1 ; i<=num ; i++)
        {
           ans*=i;
        }
         System.out.println("The required prdt. is :" + ans);
         scanner.close();
    }
    
}
