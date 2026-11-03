import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int x = 0, y = 0;
        
        for(int i = 0;i<progresses.length;i++){
            if(progresses[i] + speeds[i] * x >= 100){
                y += 1; continue;
            }
            if(y > 0){
                result.add(y);
                y = 0;
            }  
            x= (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            y = 1;
        }
        if(y > 0){
            result.add(y);
        }  
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}