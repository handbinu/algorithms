import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        char[] b = a.toCharArray();
        
        for(char c: b){
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            bw.write(c);
        }
        bw.flush();
    }
}