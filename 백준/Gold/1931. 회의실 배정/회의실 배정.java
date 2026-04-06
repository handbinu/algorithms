import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int meet[][] = new int[n][2];

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meet, (a, b) ->{
            if(a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int count = 0, meet_end = 0;
        for(int i = 0;i<n;i++){
            if(meet[i][0] >= meet_end){
                meet_end = meet[i][1];
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}