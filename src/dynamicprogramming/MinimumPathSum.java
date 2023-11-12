package dynamicprogramming;

public class MinimumPathSum {

	public static void main(String[] args) {
		System.out.println(minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}}));
		System.out.println(minPathSum(new int[][] {{1,2,3},{4,5,6}}));
	}
	
    public static int minPathSum(int[][] grid) {
        int x = grid[0].length;
        int y = grid.length;
        int cost[][] = new int[y][x];
        cost[0][0] = grid[0][0];
        if(x > 1){
            for(int i = 1; i < x; i++){
                cost[0][i] = grid[0][i] + cost[0][i-1];
            }
        }
        if(y > 1){
            for(int i = 1; i < y; i++){
                cost[i][0] = grid[i][0] + cost[i-1][0];
            }
        }        
        for(int i = 1; i < y; i++){
            for(int j = 1; j < x; j++){
                cost[i][j] = Math.min(cost[i-1][j], cost[i][j-1]) + grid[i][j];
            }
        }
        return cost[y-1][x-1];
    }

}
