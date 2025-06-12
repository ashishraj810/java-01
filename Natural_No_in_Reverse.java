//    Print natural no. in reverse order

package PRACTICE;

import java.util.Scanner;

public class Natural_No_in_Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer :");

        int num = scanner.nextInt();
        for(int i = num ; i>=1 ; i--)
        {
            System.out.println(i);
        }

        scanner.close();


    }
    
}
