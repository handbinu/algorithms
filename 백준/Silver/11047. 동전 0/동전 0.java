import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int a[] = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i = n-1; i >= 0;i--){
            if(k == 0) break;
            if(k >= a[i]){
                count += (k / a[i]);
                k %= a[i];
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}