package pattern;

import java.util.Scanner;

public class NumberTriangular {
    public static void main(String args[]){
        // Prints a right-angled triangle with numbers in increasing row order, aligned to the right.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number Triangular Print");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");
        // Enter into Row Variable
        for(int i=1; i<=n; i++){
            // Enter into Column Value
            // Printing Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Printing Value
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
            input.close();
        }

    }
}
