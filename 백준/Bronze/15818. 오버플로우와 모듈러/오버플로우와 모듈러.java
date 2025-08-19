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
        long m = Long.parseLong(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        long result = 1;
        while (n > 0) {
            long A = Long.parseLong(st2.nextToken()) % m;
            result = (result * A) % m;
            n--;
        }
        
        bw.write(String.format("%d\n", result % m));
        bw.flush();
    }
}