class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length+n-1)/n];
        int m = 0;
        for(int i = 0;i<num_list.length;i+=n){
            answer[m++] = num_list[i];
        }
        return answer;
    }
}