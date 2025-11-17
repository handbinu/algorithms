import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String m = br.readLine();
            int balance = 0;
            for(int j=0;j<m.length();j++){
                if(m.charAt(j) =='('){
                    balance++;
                }else{
                    balance--;
                }
                if(balance < 0) break;
            }
            bw.write(balance == 0 ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
}