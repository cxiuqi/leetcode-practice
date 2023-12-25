package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {

    List<List<Integer>> component = new ArrayList<List<Integer>>();
    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;
        boolean visited[] = new boolean[size];
        for(int i = 0; i < size; i++){
            ArrayList<Integer> al = new ArrayList<>();
            if(!visited[i]){
                dfs(i, visited, isConnected, al);
                System.out.println(al);
                component.add(al);
            }
        }
        return component.size();
    }

    public void dfs(int start, boolean[] visited, int[][] isConnected, ArrayList<Integer> al){
        visited[start] = true;
        al.add(start);
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[start][i] == 1 && !visited[i]){
                dfs(i, visited, isConnected, al);
            }
        }
    }
    
    int count = 0;
    public int findCircleNum1(int[][] isConnected) {
        int size = isConnected.length;
        boolean visited[] = new boolean[size];
        for(int i = 0; i < size; i++){
            if(!visited[i]){
                dfs1(i, visited, isConnected);
                count++;
            }
        }
        return count;
    }

    public void dfs1(int start, boolean[] visited, int[][] isConnected){
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[start][i] == 1 && !visited[i]){
                visited[i] = true;
                dfs1(i, visited, isConnected);
            }
        }
    }
}
