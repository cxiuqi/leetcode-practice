package dynamicprogramming;

public class MinCostClimbingStairs {
	
	public static void main(String[] args) {
		System.out.println(minCostClimbingStairs(new int[] {10,15,20}));
		System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}

    public static int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int minCost[] = new int[size + 1];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for(int i = 2; i < size; i++){
            minCost[i] = Math.min(minCost[i-1], minCost[i-2]) + cost[i];
        }
        minCost[size] = Math.min(minCost[size-1], minCost[size-2]);
        return minCost[size];
    }
}
