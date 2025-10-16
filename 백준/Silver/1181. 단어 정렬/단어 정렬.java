import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<String>(n);

        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

        for(String i : list){
            bw.write(i + "\n");
        }
        
        bw.flush();
    }
}
