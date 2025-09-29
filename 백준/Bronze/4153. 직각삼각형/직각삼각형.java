import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if (H == 0 && W == 0 && N == 0) {
                break;
            }

            int[] arr = {H, W, N};
            Arrays.sort(arr);
            long x = arr[0], y = arr[1], z = arr[2];
            bw.write((x*x + y*y == z*z)  ? "right\n" : "wrong\n");
        }
        bw.flush();
    }
}