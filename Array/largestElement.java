public class largestElement {
    public static void main(String args[]){
        // Find the largest number in array using multiple method.
        int[] nums = {47, 3, 92, 15, 78, 6, 31, 55, 89, 23, 10, 64, 71, 39, 27};
        // Searching for Largest number in array 
        int large = 0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]>large){
                large = nums[i];
            }
        }
        System.out.println(large);
    }
}
