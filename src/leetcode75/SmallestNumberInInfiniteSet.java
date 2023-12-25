package leetcode75;

import java.util.PriorityQueue;

public class SmallestNumberInInfiniteSet {

	class SmallestInfiniteSet {
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    int low = 0;
	    public SmallestInfiniteSet() {
	        low = 1;
	    }
	    
	    public int popSmallest() {
	        if(pq.size() > 0){
	            return pq.poll();
	        }
	        else{
	            low++;
	        }
	        return low-1;
	    }
	    
	    public void addBack(int num) {
	        if(low > num && !pq.contains(num)){
	            pq.add(num);
	        }
	    }
	}
}
