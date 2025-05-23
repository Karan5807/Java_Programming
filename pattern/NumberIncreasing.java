package Pattern;
import java.util.Scanner;

public class NumberIncreasing {
    public static void main(String args[]){
        // Prints a pyramid where each row contains numbers from 1 to the row number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number Triangular Print");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");

        // Enter into row 
        for(int i=1; i<=n; i++){
            // Enter into Column value
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
