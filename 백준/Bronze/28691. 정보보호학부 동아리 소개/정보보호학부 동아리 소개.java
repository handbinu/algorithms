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
        
        if (a.equals("M")) bw.write("MatKor");
        else if (a.equals("W")) bw.write("WiCys");
        else if (a.equals("C")) bw.write("CyKor");
        else if (a.equals("A")) bw.write("AlKor");
        else if (a.equals("$")) bw.write("$clear");

        bw.flush();
    }
}