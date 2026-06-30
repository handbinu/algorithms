class Solution {
    public int solution(int[] arr, int idx) {
        while(arr.length > idx){
            if(arr[idx++] == 1){
                return idx - 1;
            }
        }
        return -1;
    }
}