package dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {
	
	public static int minimumTotal(List<List<Integer>> triangle) { 
        Integer minCost[][] = new Integer[triangle.size()][triangle.size()];
        minCost[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size(); i++){
            int max = triangle.get(i).size();
            for(int j = 0; j < max; j++){
                if(j == 0 || i == 1){
                    minCost[i][j] = minCost[i-1][0] + triangle.get(i).get(j);
                }
                else if(j == max - 1){
                    minCost[i][j] = minCost[i-1][j-1] + triangle.get(i).get(j);
                }
                else{ 
                    minCost[i][j] = Math.min(minCost[i-1][j], minCost[i-1][j-1]) + triangle.get(i).get(j);
                }
            }
        }
        return Collections.min(Arrays.asList(minCost[triangle.size()-1]));
    }

}
