import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int d1 = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];

        int ans;
        if(d1 == d2) ans = arr[2] + d1;
        else if(d1 > d2) ans = arr[0] + d2;
        else ans = arr[1] + d1;

        bw.write(ans + "\n");
        bw.flush();
    }
}