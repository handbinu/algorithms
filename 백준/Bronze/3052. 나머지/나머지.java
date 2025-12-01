import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] remain = new boolean[42];
        int count = 0;
        for(int i = 0;i<10;i++){
            int a = Integer.parseInt(br.readLine());

            remain[a%42] = true;
        }
        for(int i = 0;i<42;i++){
            if(remain[i]) count++;
        }
        bw.write(count + "\n");
        bw.flush();
    }
}