import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int sum = 0, best = 0;
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0; i < n - 2; i++){
            for(int j = i+1; j < n - 1; j++){
                for(int k = j+1; k < n; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m){
                        best = Math.max(best, sum);
                        if(best == m) break;
                    }
                }
                if(best == m) break;
            }
            if(best == m) break;
        }
        bw.write(best + "\n");
        bw.flush();
    }
}