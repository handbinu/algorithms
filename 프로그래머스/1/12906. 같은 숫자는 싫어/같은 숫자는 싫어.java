import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(count == 0 || arr[i] != arr[count-1]){
                arr[count] = arr[i];
                count++;
            }
        }
         return Arrays.copyOf(arr, count);
    }
}