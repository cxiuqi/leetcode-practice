package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<Integer> num1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
         List<Integer> num2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

         ArrayList<Integer> ans1 = new ArrayList<Integer>(); 
         ArrayList<Integer> ans2 = new ArrayList<Integer>();

         for(int i = 0; i < nums1.length; i++){
             if(!num2.contains(num1.get(i)) && !ans1.contains(num1.get(i))){
                 ans1.add(num1.get(i));
             }
         }
         for(int i = 0; i < nums2.length; i++){
             if(!num1.contains(num2.get(i)) && !ans2.contains(num2.get(i))){
                 ans2.add(num2.get(i));
             }
         }
         
         List<List<Integer>> ans = new ArrayList<List<Integer>>();
         ans.add(ans1);
         ans.add(ans2);
         return ans;
	}
	
	public List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }
        
        for(int num: nums2){
            set2.add(num);
        }
        List<Integer> ans1 = new ArrayList<Integer>(set1); 
        List<Integer> ans2 = new ArrayList<Integer>(set2);
        ans1.removeAll(set2);
        ans2.removeAll(set1);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;
	}
}
