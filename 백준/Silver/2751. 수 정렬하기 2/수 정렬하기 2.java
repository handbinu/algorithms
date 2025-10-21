import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> list = new TreeSet<>();

        for(int i =0; i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        for(int i: list){
            bw.write(i+"\n");
        }
        bw.flush();
    }
}