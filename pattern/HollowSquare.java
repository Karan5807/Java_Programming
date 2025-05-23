package Pattern;
import java.util.Scanner;

public class HollowSquare {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to print Hollow Square");
        int n = input.nextInt();
        System.out.println("Printing Hollow Square");

        // Enter into row
        for(int x=1; x<=n; x++){  
            // Enter into Column
            for(int y=1; y<=n; y++){
                // Only on this place we print * else spaces
                if(x==1 || x==n || y==1 || y==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        input.close();
    }
}
