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
        int a = Integer.parseInt(br.readLine());
        double count = 0, max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[a]; 

        for(int i = 0; i < a;i++){
            arr[i] = Integer.parseInt(st.nextToken());

            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < a;i++){
            count += arr[i] / (double)max * 100;
        }

        bw.write(count / a + "\n");
        bw.flush();
    }
} //평균