package leetcode75;

public class FindTheHighestAltitude {

	public int largestAltitude(int[] gain) {
        int prefixSum[] = new int[gain.length + 1];
        prefixSum[0] = 0;
        for(int i = 1; i < gain.length + 1; i++){
            prefixSum[i] = prefixSum[i-1] + gain[i-1];
        }
        int max = -101;
        for(int sum:prefixSum){
            max = sum > max ? sum : max;
        }
        return max;
    }
}
