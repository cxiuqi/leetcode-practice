package leetcode75;

public class MaxConsecutiveOnesIII {

	public int longestOnes(int[] nums, int k) {
        int start = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                k--;
            }
            while(start < i && k < 0){
                if(nums[start] == 0){
                    k++;
                }
                start++;
            }
            if( k>= 0){
                max = Math.max(max, i-start+1);
            }
        }
        return max;
    }
}
