package pattern;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {
    public static void main(String args[]){
        // Reversal Left Half Pyramid Pattern
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row to be print");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");

        // Enter into Row
        for(int i=5; i>=1; i--){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
