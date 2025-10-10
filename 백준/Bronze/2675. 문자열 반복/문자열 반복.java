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

        for(int i = 0; i < a; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st2.nextToken());
            String S = st2.nextToken();

            for(int x = 0; x < S.length(); x++){
                for(int y = 0; y < R; y++){
                    bw.write(S.charAt(x));
                }
            }
            bw.write("\n");
        }
        bw.write("\n");
        
        bw.flush();
    }
} //2675