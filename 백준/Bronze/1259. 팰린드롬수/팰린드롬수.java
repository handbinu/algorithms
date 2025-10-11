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
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            Boolean ok = true;
    
            if(a == 0) {break;}

            String s = String.valueOf(a);

            for(int i = 0; i < s.length();i++){
                if (s.length() / 2 == i ) {
                    break;
                }

                if (s.charAt(i) != s.charAt(s.length()- (i + 1))){
                    ok = false;
                    break;
                }
            }
            if (ok) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
    }
}