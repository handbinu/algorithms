import java.util.*;
class Solution {
    int maxCount = 0;
    boolean[] visited;
    int[][] dungeons;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        dfs(k, 0);
        return maxCount;
    }
    void dfs(int health, int count){
        maxCount = Math.max(maxCount, count);
        for(int i =0;i<dungeons.length;i++){
            if(health >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                dfs(health - dungeons[i][1], count+1);
                visited[i] = false;
            }
        }
    }
}