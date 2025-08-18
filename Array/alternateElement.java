import java.util.ArrayList;

public class alternateElement {
    // Given an array arr[], the task is to print every alternate element of the array starting from the first element.
    // nput: arr[] = [10, 20, 30, 40, 50]
   //  Output: 10 30 50
  //  Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).
  public static ArrayList<Integer> alterNum(int[] nums){
    // Create a new Array name of Ans which include all the altenative element.
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0; i<nums.length; i+=2){
        ans.add(nums[i]);
    }
    return ans;
  }

  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
    System.out.println(alterNum(arr));
  }
}
