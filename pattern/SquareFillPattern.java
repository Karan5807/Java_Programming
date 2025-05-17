package pattern;

import java.util.Scanner;

public class SquareFillPattern {
    public static void main(String args[]){
        // Print a Square Fill Pattern
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of row Square");
        int n = input.nextInt();
        System.out.println("Printing Pattern......");

        for(int i=1; i<=n; i++){
            // Enter into Column
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
