package Pattern;

import java.util.Scanner;

public class PallindromeTriangle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of printing Triangle");
        int n = input.nextInt();
        System.out.println("Printing Patern....");

        // Enter into row
        for (int i = 1; i <= n; i++) {
            // Enter into Colum
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j +" ");
            }

            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
        input.close();
    }
}