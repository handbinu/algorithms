class Solution {
    public int solution(String my_string, String is_suffix) {        
        //접미사를 구하고 한번씩 검사, 이후 boolean 값에 따라 반환
        int answer = 0;
        for(int i = 0;i<my_string.length();i++){
            if(is_suffix.equals(my_string.substring(i, my_string.length()))){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}