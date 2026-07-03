import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int first = 999, second = 0; 
        for(int i = 0;i<arr.length;i++){
            if(first == 999 && arr[i] == 2){
                first = i;
            }
            if(arr[i] == 2){
                second = i;
            }
        }
        if(first == 999 && second == 0) return new int[]{-1};
        return Arrays.copyOfRange(arr, first, second+1);
    }
}