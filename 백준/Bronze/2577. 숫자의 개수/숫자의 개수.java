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
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st3.nextToken());
        
        String abc = Integer.toString(a * b * c);
        for(int i = 0; i <= 9; i++){
            int count = 0;
            for(int j = 0; j < abc.length(); j++){
                if(abc.charAt(j) == (char)('0'+i)) count++; 
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}