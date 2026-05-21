import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T= 10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int len = Integer.parseInt(br.readLine());
			int[] building = new int[len];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i =0; i<len;i++) {
				building[i] = Integer.parseInt(st.nextToken());
			}
			
			int viewCount = 0;
			for(int i =2; i<len - 2;i++) {
				int viewMax = Math.max(Math.max(building[i-1],building[i-2]), Math.max(building[i+1],building[i+2]));
				if(building[i] > viewMax) viewCount += (building[i] - viewMax);
			}
			bw.write("#" + test_case + " " + viewCount + "\n");
		}
		bw.flush();
	}
}