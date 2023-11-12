package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
		System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
		System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }

}
