import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());      
        
        for(int i=0;i<t;i++){
            int c = Integer.parseInt(br.readLine());

            int[] q = new int[4];
            int[] coins = {25, 10, 5, 1};
           
            for(int j = 0;j<4;j++){
                q[j] = c / coins[j];
                c %= coins[j];
            }

            for (int j = 0; j < q.length; j++) {
                bw.write(String.valueOf(q[j]));
                if (j < q.length - 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}