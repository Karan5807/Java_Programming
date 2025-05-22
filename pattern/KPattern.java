package pattern;

import java.util.Scanner;

public class KPattern {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Row");
        int n = input.nextInt();
        System.out.println("Printing Pattern");

        // Printing K Pattern
        for (int i = 1; i <= n-1; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
