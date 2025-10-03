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
        int num = Integer.parseInt(st2.nextToken());
        int minn = num, maxx = num;

        for(int i = 0;i < N - 1;i++){
            int num2 = Integer.parseInt(st2.nextToken());

            if(num2 < minn){
                minn = num2;
            }
            if(num2 > maxx){
                maxx = num2;
            }
        }


        bw.write(minn + " " + maxx + "\n");
        bw.flush();
    }
}