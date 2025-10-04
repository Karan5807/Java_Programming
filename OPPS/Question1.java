package OPPS;
// A class called Television has the following attributes:
// 1.	brand (String)
// 2.	screenSize (int
// 3.	dateOfPurchase (String)
// 4.	isSmartTV (boolean)
// Define a class named Question1 that contains the Television class with the above attributes.
class Television {
    String brand;
    int screenSize;
    String dateOfPurchase;
    boolean isSmartTV;

    // Constructor
    public Television(String brand, int screenSize, String dateOfPurchase, boolean isSmartTV) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.dateOfPurchase = dateOfPurchase;
        this.isSmartTV = isSmartTV;
    }

    // Getters and Setters are use for getting data and setter is used for setting data
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }
}

public class Question1{
    public static void main(String[] args) {
        // Creating an instance of Television
        Television myTV = new Television("Samsung", 55, "2022-01-15", true);

        // Displaying the attributes of the Television
        System.out.println("Brand: " + myTV.getBrand());
        System.out.println("Screen Size: " + myTV.getScreenSize() + " inches");
        System.out.println("Date of Purchase: " + myTV.getDateOfPurchase());
        System.out.println("Is Smart TV: " + myTV.isSmartTV());
    }
}
