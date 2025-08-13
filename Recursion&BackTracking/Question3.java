public class Question3 {
    public static int sumOfNum(int num){
        if (num == 0) { // Base case If num = 0 we add 0 into the sum
            return 0;
        }
        else{
            return num + sumOfNum(num-1); // Just Add num-1 into specific number.
        }
    }
    public static void main(String args[]){
        System.out.println(sumOfNum(4));
    }
}
