import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] =  Integer.parseInt(st.nextToken());
        }

        boolean asc = true, desc = true;

        for(int j = 0; j < 7; j++){
            if(arr[j] + 1 != arr[j+1]) asc = false;
            if(arr[j] - 1 != arr[j+1]) desc = false;
        }
        if(asc) bw.write("ascending");
        else if(desc) bw.write("descending");
        else bw.write("mixed");

        bw.flush();
    }
}