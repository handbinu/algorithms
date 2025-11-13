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
        int a, b, c;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lan = 0, math = 0, eng = 0, other = 0, second = 0;

        if (T >= 1) lan = Integer.parseInt(st.nextToken());
        if (T >= 2) math = Integer.parseInt(st.nextToken());
        if (T >= 3) eng = Integer.parseInt(st.nextToken());
        if (T >= 4) other = Integer.parseInt(st.nextToken());
        if (T == 5) second = Integer.parseInt(st.nextToken());
        if(lan > eng){
            a = (lan-eng) * 508;
        } else{
            a = (eng - lan) * 108;
        }
        if(math > other){
            b = (math - other) * 212;
        } else{
            b = (other - math) * 305;
        }
        if (T == 5) {
            c = second * 707;
        } else {
            c = 0;
        }
        bw.write((a+b+c)*4763+"\n");
        bw.flush();
    }
}