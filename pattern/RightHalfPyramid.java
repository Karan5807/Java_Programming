package Pattern;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String args[]){
        // Print Right half Triangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = input.nextInt();
        System.out.println("Printing Pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
