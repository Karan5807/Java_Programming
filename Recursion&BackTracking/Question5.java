
public class Question5 {
    public static boolean isSorted(int[] nums, int n){
        if (n==0 || n ==1) {
            return true;
        }
        return nums[n-1]>=nums[n-2] && isSorted((nums), n-1);

    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(isSorted(nums,nums.length));
    }
}
