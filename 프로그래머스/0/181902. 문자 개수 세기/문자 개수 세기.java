class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0;i<my_string.length();i++){
            int value = my_string.charAt(i);
            if(value >= 65 && value <= 90){
                answer[value-65]++;
            }else if(value >= 97 && value <= 122){
                answer[value-71]++;
            }
        }
        return answer;
    }
}