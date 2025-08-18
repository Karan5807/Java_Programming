//     // Given an array arr[], the task is to print every alternate element of the array starting from the first element.
    // nput: arr[] = [10, 20, 30, 40, 50]
   //  Output: 10 30 50
  //  Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).

import java.util.ArrayList;

public class Question6 {
    public static ArrayList<Integer> alterNum(int[] nums, n){
        ArrayList <Integer> Res = new ArrayList<>();
        if (n==0) {
            return Res.add(nums[0]);
        }
        else{
            return Res.add(alterNum(nums-2,n));
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> ans = new ArrayList<>();
    }
}
