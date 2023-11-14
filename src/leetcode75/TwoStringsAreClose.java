package leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoStringsAreClose {
	public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        if(word1.length() != word2.length()){
            return false;
        }
        for(Character i:word1.toCharArray()){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for(Character i:word2.toCharArray()){
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> val1 = new ArrayList<Integer>(map1.values());
        ArrayList<Integer> val2 = new ArrayList<Integer>(map2.values());
        Collections.sort(val1);
        Collections.sort(val2);
        return(val1.equals(val2) && map1.keySet().equals(map2.keySet()));
    }
}
