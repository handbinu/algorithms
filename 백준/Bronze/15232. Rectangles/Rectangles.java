import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String star = "*".repeat(C);

        for(;R > 0;R--){
            bw.write(star);
            bw.newLine();
        }
        bw.flush();
    }
}