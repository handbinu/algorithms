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
        
        int t1 = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int t2 = Integer.parseInt(st2.nextToken());
        int v2 = Integer.parseInt(st2.nextToken());

            
        
        if(t2 < 0 && v2 >= 10){
            bw.write("A storm warning for tomorrow! Be careful and stay home if possible!\n");
        }else if(t2 < t1){
            bw.write("MCHS warns! Low temperature is expected tomorrow.\n");
        }else if(v2 > v1){
            bw.write("MCHS warns! Strong wind is expected tomorrow.\n");
        }else{
            bw.write("No message\n");
        }
        bw.flush();
    }
}