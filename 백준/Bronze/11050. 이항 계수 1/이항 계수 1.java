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
        int k = Integer.parseInt(st.nextToken());
        int nn = 1, kk = 1;

        for(int i = 1; i <= n;i++){
            nn *= i;
        }
        for(int j = 1; j <= k;j++){
            kk *= j;
        }
        for(int j = 1; j <= n - k;j++){
            kk *= j;
        }
        
        bw.write(nn / kk + "\n");
        bw.flush();
    }
}
