public class searchElement {
    public static int searchNum(int[] nums, int k){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length);
        System.out.println(searchNum(arr, 1));
    }
}
