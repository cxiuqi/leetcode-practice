package leetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

	class Solution {
	    public int equalPairs(int[][] grid) {
	        Map<String, Integer> rowMap = new HashMap<String, Integer>();
	        Map<String, Integer> colMap = new HashMap<String, Integer>();
	        int totalPairs = 0;
	        for(int i = 0; i < grid.length; i++){
	            rowMap.put(Arrays.toString(grid[i]), rowMap.getOrDefault(Arrays.toString(grid[i]), 0) + 1);
	        }
	        int[][] transpose = transposeMatrix(grid);
	        for(int i = 0; i < grid.length; i++){
	            totalPairs += rowMap.getOrDefault(Arrays.toString(transpose[i]), 0);
	        }
	        return totalPairs;
	    }

	    public int[][] transposeMatrix(int[][] grid){
	        int[][] transpose = new int[grid.length][grid.length];
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0; j < grid.length; j++){
	                transpose[i][j] = grid[j][i];
	            }
	        }
	        return transpose;
	    }
	}
}
