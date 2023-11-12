package leetcode75;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {

	public static void main(String[] args) {

		System.out.println(maxOperations(new int[] {1,2,3,4}, 5));
		System.out.println(maxOperations(new int[] {3,1,3,4,3}, 6));

	}

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int numOperations = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        for(int key: map.keySet()){
            int target = k-key;
            int num = 0;
            if(map.containsKey(target) && map.get(target) >= 1){
                if(target == key && map.get(target) == 1){ // if erasing the same value
                    continue;
                }
                if(target == key){
                    num = Math.min(map.get(target), map.get(key))/2;
                }
                else{
                    num = Math.min(map.get(target), map.get(key));
                }
                map.put(target, map.get(target) - num);
                map.put(key, map.get(key) - num);
                numOperations += num;
            }
        }
        return numOperations;
    }
    public static int maxOperations1(int[] nums, int k) {
    	Arrays.sort(nums);
        int result = 0;
        int i = 0;
        int j = nums.length-1;
        while (j > i){
            int sum = nums[i] + nums[j];
            if(sum == k){
                i++;
                j--;
                result++;
            }
            else if(sum < k){
                i++;
            }
            else{
                j--;
            }
        }
        return result;
    }
    
}
