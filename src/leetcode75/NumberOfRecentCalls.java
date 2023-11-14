package leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {

	class RecentCounter {
	    private Queue<Integer> q;

	    public RecentCounter() {
	        this.q = new LinkedList<Integer>();
	    }
	    
	    public int ping(int t) {
	        q.offer(t);
	        while(q.peek() < t-3000){
	            q.poll();
	        }
	        return q.size();
	    }
	}
}
