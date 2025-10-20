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
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
                
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+" ");

            if(b >= 97){
                bw.write("A+\n");
            }else if(b >= 90){
                bw.write("A\n");
            }else if(b >= 87){
                bw.write("B+\n");
            }else if(b >= 80){
                bw.write("B\n");
            }else if(b >= 77){
                bw.write("C+\n");
            }else if(b >= 70){
                bw.write("C\n");
            }else if(b >= 67){
                bw.write("D+\n");
            }else if(b >= 60){
                bw.write("D\n");
            }else{
                bw.write("F\n");
            }
        }
        bw.flush();
    }
}
