package OPPS;
// This is an exapmle of Paramterized constructor 
class Customer{
    String name;
    String gender;
    int accNo;
    int balance;

    public void getCustInfo(){
        System.out.println(this.name + "  " + this.gender + "  " + this.accNo);
    }

    public void getCustbala(){
        System.out.println("your balance is  " + this.balance);
    }

    // We pass parameter into the Customer Class
    // As we the parameter we pass their name is different from defiend variable 
    Customer( String fullName, String gen, int accNum, int amount){
        this.name = fullName;
        this.gender = gen;
        this.accNo = accNum;
        this.balance = amount;
    }
}

public class parameterCons {
 public static void main(String args[]){
    Customer cust1 = new Customer("Singh Karan", "M", 12345, 342354);
    cust1.getCustbala();
 }   
}
