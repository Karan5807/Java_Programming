class Question2 {
    public static int printFact(int num){
        if (num == 0) { // Base Case 
            return 1;
        } else {
            return num * printFact(num-1); // Multiply n * num-1 factorial
        }
    }

    public static void main(String args[]){
        System.out.println(printFact(4));
    }
}
