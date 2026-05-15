import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			bw.write("#"+test_case + "\n");
			int n = Integer.parseInt(br.readLine());
            int[][] run = new int[n][n];
            boolean[][] check = new boolean[n][n];
            int dir = 0;
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int i = 1, x= 0, y=0;
            while(i <= n*n){
                run[x][y]=i++;
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n || run[nx][ny] != 0){
					dir = ((dir+1)%4);
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }
                x= nx;
                y= ny;
            }
           	for(int j = 0;j<n;j++){
            	for(int k = 0; k<n;k++){
                	bw.write(run[j][k]+" ");
                }
                bw.write("\n");
            }
		}
        bw.flush();
	}
}