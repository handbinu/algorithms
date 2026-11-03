import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] rank = new int[10];
        for(int i = 0; i<priorities.length;i++){
            rank[priorities[i]]++;
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }
        
        while(!queue.isEmpty()){
            int index = queue.poll();
            int priority =  priorities[index];
            
            boolean hasHigher = false;
            
            for(int j = priority+1; j<=9; j++){
                if(rank[j] > 0){
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher){
                queue.offer(index);
            } else {
                rank[priority]--;
                answer++;
                
                if(index == location){
                    return answer;
                }
            }
        }
        return answer;

    }
}