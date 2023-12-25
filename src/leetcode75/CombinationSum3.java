package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k, 1, n, new ArrayList<>(), ans);
        return ans;
    }

    void helper(int k, int index, int n, ArrayList<Integer> val, List<List<Integer>> ans){
        if(val.size() == k & n == 0){
            List<Integer> li = new ArrayList<Integer>(val);
            ans.add(li);
            return;
        }
        for(int i = index; i <= 9; i++){
            val.add(i);
            helper(k, i+1, n-i, val, ans);
            val.remove(val.size()-1);
        }
    }
}
