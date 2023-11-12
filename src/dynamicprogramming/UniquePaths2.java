package dynamicprogramming;

public class UniquePaths2 {

	public static void main(String[] args) {
		System.out.println(uniquePathsWithObstacles(new int[][] {{0,0,0},{0,1,0},{0,0,0}}));
		System.out.println(uniquePathsWithObstacles(new int[][] {{0,1},{0,0}}));
	}
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x = obstacleGrid[0].length;
        int y = obstacleGrid.length;
        int dp[][] = new int[y][x];

        boolean obstacle = false;

        for(int i = 0; i < y; i++){
            if(obstacleGrid[i][0] == 1){
                obstacle = true;
            }
            if(obstacle){
                dp[i][0] = 0;
            }
            else{
                dp[i][0] = 1;
            }
        }    

        obstacle = false;
        for(int i = 0; i < x; i++){
            if(obstacleGrid[0][i] == 1){
                obstacle = true;
            }
            if(obstacle){
                dp[0][i] = 0;
            }
            else{
                dp[0][i] = 1;
            }
        }    
        
        for(int i = 1; i < y; i++){
            for(int j = 1; j < x; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = 1;
                }
            }
        }

        for(int i = 1; i < y; i++){
            for(int j = 1; j < x; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }

            }
        }
        return dp[y-1][x-1];
    }
}
