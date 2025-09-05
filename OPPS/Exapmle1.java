package OPPS;
//  This is a simple use case of OOP concet 
// Here we first define class then we further procced with main class
class Car {
    String brand;
    String name;
    String color;
    int price;

    public void printInfo() {
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.price);
    }
}

class Bike {
    String brand;
    String name;
    String color;
    int price;

    public void printdetail() {
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.color);
    }
    public void printPrice(){
        System.out.println(this.price);
    }
}

public class Exapmle1 {
    public static void main(String args[]) {
        // Creating Car Object
        Car car1 = new Car();
        // Creating Bike objects
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();

        // Assing data to Car Class means "Give details to Class for creating to Object"
        car1.brand = "Toyota";
        car1.name = "Innova";
        car1.color = "White";
        car1.price = 1780000;

        // Creating Bike Object 1
        bike1.brand = "Hero";
        bike1.name = "Splendor";
        bike1.color = "Blue";
        bike1.price = 78000;

        // Creating Bike Object 2
        bike2.brand = "Hero";
        bike2.color = "passion";
        bike2.color = "White";
        bike2.price = 89000;


        // Now Calling Car Class Methods for See details of Object car1
        car1.printInfo(); // car1 means show all details of car1 only

        // Calling Method for Bike details for Object
        bike1.printdetail();  
        // calling method for see price of bike2 objects
        bike2.printPrice();

    }
}
