package leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

	public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        char arr[] = senate.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 'R'){
                r.offer(i);
            }
            else{
                d.offer(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty()){
            int ri = r.poll();
            int di = d.poll();

            if(ri < di){
                r.offer(n++);
            }
            else{
                d.offer(n++);
            }
        }
        return !r.isEmpty() ? "Radiant" : "Dire";
    }
}
