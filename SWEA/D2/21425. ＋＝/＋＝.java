import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T;
		T=Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            
            long max = Math.max(x, y);
            long min = Math.min(x, y);
            long count = 0;
            while(true){
                min += max;
                if(min > max){
                 	long temp = min;
                    min = max;
                    max = temp;
                }
                count += 1;
                if(max > n){break;}
            }
            bw.write(count+"\n");
		}
        bw.flush();
	}
}