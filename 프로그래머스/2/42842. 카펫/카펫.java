class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int x = 3;x < brown+yellow;x++){
            int y = (brown + yellow) / x;
            if(x * y == brown + yellow && yellow == (x - 2) * (y - 2)){
                answer[0] = Math.max(x, y);
                answer[1] = Math.min(x, y);
                return answer;
            }
        }
        return answer;
    }
}