package leetcode75;

public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                int left = 0;
                int right = sum[nums.length-1] - sum[i];
                if(left==right){
                    return i;
                }
            }
            else{
                int left = sum[i-1];
                int right = sum[nums.length-1] - sum[i];
                if(left==right){
                    return i;
                }
            }
            
        }
        return pivotIndex;
    }
}
