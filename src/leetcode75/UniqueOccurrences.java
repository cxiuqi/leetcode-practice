package leetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        Set<Integer> listSet = new HashSet<Integer>(map.values());
        return (list.size() == listSet.size());
    }
}
