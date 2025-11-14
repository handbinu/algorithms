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

        int[] result = new int[n+m];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n;i++){
            result[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0; i < n; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n+m; j++){
                int x = Integer.parseInt(st3.nextToken());
                result[i] -= x;
                result[j] += x;
            }
        }
        
        for(int i : result){
            bw.write(i + " ");
        }
        bw.flush();
    }
}