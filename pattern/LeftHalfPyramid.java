package pattern;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row to be print...");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
