package chapter1;
// In this we learn taking input from system and evalute them

import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double percentage;
        String address;
        try {
            System.out.println("Enter your name");
            name = input.nextLine();

            System.out.println("Enter your age");
            age = input.nextInt();

            System.out.println("Enter your 12th Percentage");
            percentage = input.nextDouble();

            System.out.println("Enter you address");
            address = input.next();

            System.out.println("Your name is " + name);
            System.out.println(age);
            System.out.println(percentage);
            System.out.println(address);
        } catch (Exception e) {
            System.err.println("Did not input the value of : " + e);
        } finally {
            input.close();
        }

    }
}
