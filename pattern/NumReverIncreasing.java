package pattern;

import java.util.Scanner;

public class NumReverIncreasing {
    public static void main(String args[]) {
        // Prints a pyramid where each row contains numbers from 1 to the row number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number Triangular Print");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");
        
        // Enter into Row first
        for(int i=n; i>=1; i--){
            // Enter into Column
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
