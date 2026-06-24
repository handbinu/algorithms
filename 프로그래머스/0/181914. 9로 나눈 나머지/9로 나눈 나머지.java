class Solution {
    public int solution(String number) {
        int plus = 0;
        for(int i = 0;i < number.length();i++){
            plus += number.charAt(i) - '0';
        }
        return plus%9;
    }
}