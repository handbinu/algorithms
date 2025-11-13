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
        StringTokenizer stt = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(stt.nextToken());
        int y = Integer.parseInt(stt.nextToken());

        int x_min = x, x_max = x, y_max = y, y_min = y;
        for(int i = 0; i < n - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            x_max = Math.max(x_max, x);
            x_min = Math.min(x_min, x);
            y = Integer.parseInt(st.nextToken());
            y_max = Math.max(y_max, y);
            y_min = Math.min(y_min, y);
        }
        

        bw.write((x_max - x_min) * (y_max - y_min)+"\n");
        bw.flush();
    }
}