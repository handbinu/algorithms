import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int answer = 0;
        for(int i = 0;i<scoville.length;i++){
            minHeap.offer(scoville[i]);
        }
        while(!minHeap.isEmpty()){
            int n = minHeap.poll();
            if(n >= K) break;
            if(minHeap.isEmpty()) return -1;
            n = n + (minHeap.poll() * 2);
            minHeap.offer(n);
            answer++;
        }
        return answer;
    }
}