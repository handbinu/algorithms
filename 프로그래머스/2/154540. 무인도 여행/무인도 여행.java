import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] check = new boolean[n][m];
        int[][] intMap = new int[n][m];

        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                intMap[i][j] = maps[i].charAt(j) == 'X'? 0 : maps[i].charAt(j) - '0';
            }
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                //dps List+=, check
                if(intMap[i][j] > 0 && !check[i][j]){
                    answerList.add(dps(i, j, intMap, check));
                }
            }
        }
        
        if(answerList.isEmpty()){
            return new int[]{-1};
        }
        
        Collections.sort(answerList);
        int[] answer = new int[answerList.size()];
        for(int i = 0; i< answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
           
    }
    
    public int dps(int a, int b, int[][] intMap, boolean[][] check) {
        check[a][b] = true;
        int sum = intMap[a][b];
        
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        
        for(int i = 0;i<4;i++){
            int nx = a + x[i];
            int ny = b + y[i];
            
            if(nx >= 0 && ny >= 0 && nx < intMap.length && ny < intMap[0].length){
                if(intMap[nx][ny] > 0 && !check[nx][ny]){
                    sum += dps(nx, ny, intMap, check);
                }
            }
        }
        return sum;
    }
}
