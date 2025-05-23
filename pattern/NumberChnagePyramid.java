package Pattern;
import java.util.Scanner;

public class NumberChnagePyramid {
// Prints a pyramid where numbers increase continuously from top to bottom.
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print Pyramid");
        int n = input.nextInt();
        System.out.println("Printing Pattern....");
        int num = 1;
        // Enter into Row
        for(int i=1; i<=n; i++){
            // Enter into Column
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
        input.close();
    }
}
