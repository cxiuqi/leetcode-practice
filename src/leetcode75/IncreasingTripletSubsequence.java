package leetcode75;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] test1 = {20,100,10,12,5,13};
		int[] test2 = {1,2,3,4,5};
		int[] test3 = {5,4,3,2,1};
		int[] test4 = {20,100,10,12,5,13};
		
		System.out.println(increasingTriplet(test1));
		System.out.println(increasingTriplet(test2));
		System.out.println(increasingTriplet(test3));
		System.out.println(increasingTriplet(test4));
	}
	
	public static boolean increasingTriplet(int[] nums) {
        int size = nums.length;
        int[] minDp = new int[size];
        int[] maxDp = new int[size];
        minDp[0] = nums[0];
        maxDp[size-1] = nums[size-1];
        for(int i = 1; i < size; i++){
            minDp[i] = Math.min(nums[i], minDp[i-1]);
        }
        for(int i = size-2; i >= 0; i--){
            maxDp[i] = Math.max(nums[i], maxDp[i+1]);
        }
        for(int i = 0; i < size; i++){
            if(nums[i] < maxDp[i] && nums[i] > minDp[i]){
                return true;
            }
        }        
        return false;
    }
	 public boolean increasingTriplet1(int[] nums) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MAX_VALUE;
	        for(int num : nums){
	            if(num <= min){
	                min = num;
	            }
	            else if(num <= max){
	                max = num;
	            }
	            else{
	                return true;
	            }
	        }
	        return false;
	    }

}
