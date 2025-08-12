// Print Number from N to 1 Using Recursion
class Question1 {
    public static void printNum(int num) {
        if (num == 1) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num+" ");
            printNum(num-1);
        }

    }

    public static void main(String args[]) {
        printNum(9);
    }
}