package pattern;
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String args[]) {
        System.out.println("Enter the value to Print Zero one Triangle");
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        System.out.println("Printing Pattern");
        for (int i = 1; i <= line; i++) {
            // Enter into Column
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
            input.close();
        }
    }
}
