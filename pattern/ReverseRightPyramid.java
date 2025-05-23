package Pattern;

import java.util.Scanner;

public class ReverseRightPyramid {
    public static void main(String args[]){
        // Write a code to Print a Reverse Right Half Pyramid
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row you want to Print");
        int n =input.nextInt();
        System.out.println("Printing Pattern");

        // Enter into row
        for(int i=n; i>=1; i--){
            // Enter into Column
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
