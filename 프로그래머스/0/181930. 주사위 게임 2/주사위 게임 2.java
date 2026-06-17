import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && b == c){
            return (int)((a + b + c) * (a*a + b*b + c*c) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }
        if(a == b || b == c || a == c){
            return (a + b + c) * (a*a + b*b + c*c);
        }
        return a + b + c;
    }
}