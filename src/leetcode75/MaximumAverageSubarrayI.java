package leetcode75;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = -Double.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxAvg = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxAvg = sum > maxAvg ? sum : maxAvg;
        }
        return maxAvg/(double)k;
    }
}
