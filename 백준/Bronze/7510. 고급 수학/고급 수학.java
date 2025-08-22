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
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = Math.max(a, Math.max(b, c));
            long aa = (long) a * a;
            long bb = (long) b * b;
            long cc = (long) c * c;
            bw.write("Scenario #" + i + ":\n");

            if(max == a && aa == bb + cc) {
                bw.write("yes\n");
            } else if(max == b && bb == aa + cc) {
                bw.write("yes\n");
            } else if(max == c && cc == aa + bb) {
                bw.write("yes\n");
            } else{ 
                bw.write("no\n");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}