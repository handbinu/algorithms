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
        int ki = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int kn = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        ki = 1 - ki;
        q = 1 - q;
        l = 2 - l;
        b = 2 - b;
        kn = 2 - kn;
        p = 8 - p;
        
        bw.write(ki + " " + q + " " + l + " " + b + " " + kn + " " + p);
        bw.flush();
    }
}