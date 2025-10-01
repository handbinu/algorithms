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

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for(int i = 0;i < 6;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st3.nextToken());
        int P = Integer.parseInt(st3.nextToken());

        int countT = 0;
        for(int a: arr){
            countT += (a + T - 1) / T;
        }

        bw.write(countT + "\n");
        bw.write(N / P+ " " + N % P + "\n");
        
        bw.flush();
    }
}