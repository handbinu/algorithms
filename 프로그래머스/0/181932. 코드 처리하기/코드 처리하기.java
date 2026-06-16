class Solution {
    public String solution(String code) {
        int len = code.length();
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for(int i = 0;i<len;i++){
            if(code.charAt(i) == '1'){
                mode = !mode;
                continue;
            }
            if (mode) {
                if (i % 2 == 1) {
                    sb.append(code.charAt(i));
                }
            } else { 
                if (i % 2 == 0) {
                    sb.append(code.charAt(i));
                }
            }
        }
        String answer = sb.toString();
        if (answer.isEmpty()) {
            return "EMPTY";
        }
        
        return answer;
    }
}