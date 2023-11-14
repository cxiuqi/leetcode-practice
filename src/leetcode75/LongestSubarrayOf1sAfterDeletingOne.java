package leetcode75;

public class LongestSubarrayOf1sAfterDeletingOne {

	public int longestSubarray(int[] nums) {
        int start = 0; 
        int max = 0;
        int k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                k--;
            }
            while(start < i && k < 0){
                if(nums[start] == 0){
                    k++;
                }
                start++;
            }
            if(k >= 0){
                max = Math.max(max, i-start);
            }
        }    
        return max;
    }
	
    public int longestSubarray1(int[] nums) {
        int i = 0, j = 0, k = 1, res = 0;
        while(j < nums.length){
            if(nums[j] == 0){ // right pointer if meet 0 then minus k 
                k--;
            }
            while(k < 0){ // while it is 0, move ther left pointer until it meets the next zero then continue to check the streak
                if(nums[i++] == 0){
                    k++;
                }
            }
            res = Math.max(res, j++-i);
        }
        return res;
    }
}
