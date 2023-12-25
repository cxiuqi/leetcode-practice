package leetcode75;

import java.util.List;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int sizeOfGraph = rooms.size();
        boolean visited[] = new boolean[sizeOfGraph];
        dfsUtil(0, visited, rooms);
        int visitedRooms = 0;
        for(int i = 0; i < sizeOfGraph; i++){
            if(visited[i]){
                visitedRooms++;
            }
        }
        return (visitedRooms == sizeOfGraph);
    }

    public void dfsUtil(int v, boolean[] visited, List<List<Integer>> rooms){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        List<Integer> key = rooms.get(v);
        for(int i = 0; i < key.size(); i++){
            dfsUtil(key.get(i), visited, rooms);
        }
    }
}
