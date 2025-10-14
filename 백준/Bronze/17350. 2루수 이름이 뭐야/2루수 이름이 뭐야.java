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
        Boolean ch = false;
        for(int i = 0;i < n;i++){
            String base = br.readLine();
            if("anj".equals(base)){
                bw.write( "뭐야;\n");
                ch = true;
                break;
            }
        }
        if(!ch){
            bw.write( "뭐야?\n");
        }
        bw.flush();
    }
}