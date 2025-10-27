import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total=0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String kind = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            if (kind.equals("Stair")) {
                total += 17 * n;
            } else if (kind.equals("Es")) {
                total += 21 * n;
            }
        }
        bw.write(total+"\n");
        bw.flush();
    }
}