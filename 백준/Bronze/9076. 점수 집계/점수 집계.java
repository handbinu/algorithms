import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>(5);
            
            for(int j =0;j<5;j++){ list.add(Integer.parseInt(st.nextToken()));}
            Collections.sort(list);

            if(list.get(3)-list.get(1) >= 4){
                bw.write("KIN\n");
            }else{
                bw.write(list.get(1) + list.get(2) +list.get(3) + "\n");
            }
            
        }
        bw.flush();
    }
}
