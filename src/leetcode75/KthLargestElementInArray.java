package leetcode75;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        int val = 0;
        while(k!=0){
            val = pq.poll();
            k--;
        }
        return val;
    }
}
