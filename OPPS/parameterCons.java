package OPPS;
// This is an exapmle of Paramterized constructor 
class CustomerD{
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
    CustomerD( String fullName, String gen, int accNum, int amount){
        this.name = fullName; // Here this.name = fullName means String name given value to fullName
        this.gender = gen;
        this.accNo = accNum;
        this.balance = amount;
    }
}

public class parameterCons {
 public static void main(String args[]){
    CustomerD cust1 = new CustomerD("Singh Karan", "M", 3423424, 74637);
    CustomerD cust2 = cust1; // Here we Use Compy Constructor where we copy the data of One Object to another Object just creating another object and assign that any previous object.
    cust1.getCustbala();
    cust2.getCustInfo();
 }   
}
