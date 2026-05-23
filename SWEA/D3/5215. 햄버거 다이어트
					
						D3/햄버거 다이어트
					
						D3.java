import java.util.*;
import java.io.*;

class Solution {
    static int N, L;
    static int[][] ham;
    static int[][] memo; 
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            
            ham = new int[N][2];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                ham[i][0] = Integer.parseInt(st.nextToken());
                ham[i][1] = Integer.parseInt(st.nextToken());
            }
            
            memo = new int[N + 1][L + 1];
            
            for (int i = 0; i <= N; i++) {
                Arrays.fill(memo[i], -1);
            }
            
            int ans = dfs(0, 0);
            
            bw.write("#" + test_case + " " + ans + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static int dfs(int index, int calorie) {
        if (calorie > L) {
            return -999999;
        }
        
        if (index == N) {
            return 0;
        }
        
        if (memo[index][calorie] != -1) {
            return memo[index][calorie];
        }
        
        int put = ham[index][0] + dfs(index + 1, calorie + ham[index][1]);
        int skip = dfs(index + 1, calorie);
        
        memo[index][calorie] = Math.max(put, skip);
        return memo[index][calorie];
    }
}