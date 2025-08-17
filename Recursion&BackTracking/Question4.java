// Using Recusrion and backtracking solve Problems 
// Question Write Fibonaaci Series of nth Number
public class Question4{
    public static int printFibon(int num){
        if (num == 0 || num == 1) {
            return num;
        }
        else{
            return printFibon(num-1) + printFibon(num-2);
        }
    }

    public static void main(String args[]){
        System.out.println(printFibon(6));
    }
}