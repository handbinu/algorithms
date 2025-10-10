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
        int a = Integer.parseInt(st.nextToken());

        int count = 1, i = 0;
        for(i = 1; i < a; i++){
            count += 6*i;
            if(a <= count) break;
        }
        if(a != 1){
            i += 1;
        }
        bw.write(i + "\n");
        
        bw.flush();
    }
} //2292