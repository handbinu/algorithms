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
        int count = 0;

        for(int i = 0;i < N;i++){
            int num = Integer.parseInt(st2.nextToken());

            if(num < 2) continue;

            boolean isPrime = true;
            for(int j = 2;j * j <= num;j++){
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }


        bw.write(count + "\n");
        bw.flush();
    }
}