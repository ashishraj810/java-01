import java.util.Scanner;

public class n_natural_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        

        int i;
        System.out.println("Array elements : ");
        

        for( i=1 ; i<=n ; i++)
        {
           
        System.out.println(i);
        }
       
    }
    
}
