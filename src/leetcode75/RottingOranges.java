package leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

	class Pair {
	    int x;
	    int y;
	    Pair(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	    int getX() {return x;}
	    int getY() {return y;}
	}

	class Solution {
	    public int orangesRotting(int[][] grid) {
	        int m = grid.length;
	        int n = grid[0].length;
	        Queue<Pair> q = new LinkedList<Pair>();
	        boolean visited[][] = new boolean[m][n];
	        int[] drow = {-1,0,1,0};
	        int[] dcol = {0,1,0,-1};
	        int counter = 0;
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if(grid[i][j] == 2){
	                    visited[i][j] = true;
	                    q.offer(new Pair(i, j));
	                }
	            }
	        }
	        while(!q.isEmpty()){
	            counter++;
	            int size = q.size();
	            for(int i=0;i<size;i++) {
	                Pair rotting = q.poll();
	                if(rotting.x >= 0 && rotting.x < m && rotting.y+1 >= 0 && rotting.y+1 < n){
	                    if(grid[rotting.x][rotting.y+1] == 1 && !visited[rotting.x][rotting.y+1]){
	                        q.offer(new Pair(rotting.x, rotting.y+1));
	                        grid[rotting.x][rotting.y+1] = 2;
	                        visited[rotting.x][rotting.y+1] = true;
	                    }
	                }
	                if(rotting.x >= 0 && rotting.x < m && rotting.y-1 >= 0 && rotting.y-1 < n){
	                    if(grid[rotting.x][rotting.y-1] == 1 && !visited[rotting.x][rotting.y-1]){
	                        q.offer(new Pair(rotting.x, rotting.y-1));
	                        grid[rotting.x][rotting.y-1] = 2;
	                        visited[rotting.x][rotting.y-1] = true;
	                    }
	                    
	                }
	                if(rotting.x+1 >= 0 && rotting.x+1 < m && rotting.y >= 0 && rotting.y < n){
	                    if(grid[rotting.x+1][rotting.y] == 1 && !visited[rotting.x+1][rotting.y]){
	                        q.offer(new Pair(rotting.x+1, rotting.y));
	                        grid[rotting.x+1][rotting.y] = 2;
	                        visited[rotting.x+1][rotting.y] = true;
	                    }
	                    
	                }
	                if(rotting.x-1 >= 0 && rotting.x-1 < m && rotting.y >= 0 && rotting.y < n){
	                    if(grid[rotting.x-1][rotting.y] == 1 && !visited[rotting.x-1][rotting.y]){
	                        q.offer(new Pair(rotting.x-1, rotting.y));
	                        grid[rotting.x-1][rotting.y] = 2;
	                        visited[rotting.x-1][rotting.y] = true;
	                    }
	                }
	            }
	        }
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1)
	                    return -1;
	            }
	        }
	        return (counter == 0) ? counter : counter-1;
	    }
	}
}
