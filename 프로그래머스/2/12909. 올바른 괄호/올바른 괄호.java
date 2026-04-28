import java.util.*;
class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.add(s.charAt(i));
            } else {
                if(stack.isEmpty()) { 
                    return false;
                }
                // 스택에는 '('만 들어있으므로 별도의 peek 확인 없이 pop 수행
                stack.pop();
            }
        }
        if(!stack.isEmpty()) { return false;}
        return answer;
    }
}