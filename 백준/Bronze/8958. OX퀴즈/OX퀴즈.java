import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int i = Integer.parseInt(br.readLine());i>0;i--){
            String cs = br.readLine();
            int val = 0, count = 0;
            for(int j = 0; j < cs.length();j++){
                if(cs.charAt(j) == 'O'){
                    count += ++val;
                } else {
                    val = 0;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}