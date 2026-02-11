class Solution {
    public int[] solution(int n, int s) {
        if (s < n) return new int[]{-1};
        
        int[] answer = new int[n];
        int center = s/n;
        int remain = s%n;
        
        for(int i = 0; i < n;i++){
            answer[i] = center;
        }
        for(int i = n-1;remain > 0;i--){
            answer[i]++;
            remain--;
        }
        return answer;
    }
}