import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int arr[] = new int[m];
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        int arr2[] = new int[n];
        i = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while (st2.hasMoreTokens()) {
            arr2[i++] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        for(int j :arr2){
            int mid, left = 0, right = m;
            while(left < right){
                mid = (left + right)/2;
                if(j < arr[mid]){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
            int count = left;

            left = 0;
            right = m;
            while(left < right){
                mid = (left + right)/2;
                if(j > arr[mid]){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
            count -= left;
            bw.write(count + " ");
        }
        bw.flush();
    }
}