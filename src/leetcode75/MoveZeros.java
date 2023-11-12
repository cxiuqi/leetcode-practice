package leetcode75;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        // sorting 
        //if 0 => move to the back 
        // else => move in front 
        int j = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
               int temp = nums[j];
               nums[j] = nums[i];
               nums[i] = temp;
               j++;
           }
        }
    }
}