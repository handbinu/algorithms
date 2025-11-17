import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int i = 0;
        while (st.hasMoreTokens()){
            a[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(a);


        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] b = new int[m];
        i = 0;
        while (st2.hasMoreTokens()){
            b[i]=Integer.parseInt(st2.nextToken());
            i++;
        }

        for(int j : b){
            int right = (n-1);
            int left = 0;
            boolean ok = false;
            while (left <= right) {
                int mid = (right + left) / 2;
                if(a[mid] == j){
                    ok = true;
                    break;
                }else if(a[mid] < j){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            if(ok){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }

        bw.flush();
    }
}