package OPPS;

// Non - Parametrized Constructor  example
class Customer {
    String name;
    String gender;
    int accNo;
    int balance;

    public void getCustdetail() {
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.accNo);
    }

    public void getbalance() {
        System.out.println(this.balance);
    }

    // Non-parametrized Constructor which call by-default Java 
    // Whenever we create a new object using Customer class this called by default as it's java by default setup.
    Customer(){
        System.out.println("Constructor called");
    }    
}

public class nonParameter {
    public static void main(String args[]) {
        Customer cust1 = new Customer();
        cust1.accNo = 223347800;
        cust1.balance = 786756;
        cust1.name = "Kumar";
        cust1.gender = "Male";

        cust1.getCustdetail();

        Customer cust2 = new Customer();
        cust2.accNo = 2344800;
        cust2.balance = 65734;
        cust2.name = "sanhgi";
        cust2.gender = "feMale"; 
        cust2.getbalance();

    }
}