public class secondLarEle {
    // Using two variable 
    public static int usingTwoVariable(int[]nums){
        int largest = 0;
        int secLar = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secLar && nums[i] != largest) {
                secLar = nums[i];
            }
        }

        return secLar;
    }
    // Using One Variable 
    public static int usingOneVariable(int[] nums){
        int largest = 0;
        int seclar = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest ){
                largest=nums[i];
                seclar = largest;
            }
            else if(nums[i]<largest && )
        }
    }
    public static void main(String args[]) {

        // Find the second largest number in array using multiple method.
        int[] nums = { 47, 3, 92, 15, 78, 6, 31, 55, 89, 23, 10, 64, 71, 39, 27 };

    }
}
