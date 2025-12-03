import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] index = new int[26];
        for(int i=0;i<26;i++){
            index[i] = -1;
        }

        String cs = br.readLine();
        for(int i = 0;i<cs.length();i++){
            if(index[cs.charAt(i) - 'a'] == -1){
                index[cs.charAt(i) - 'a'] = i;
            }
        }
        for(int i=0;i<26;i++){
             bw.write(index[i] + " ");
        }
        bw.flush();
    }
}