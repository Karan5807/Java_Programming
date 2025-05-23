package Pattern;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");

        // Enter into row
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
