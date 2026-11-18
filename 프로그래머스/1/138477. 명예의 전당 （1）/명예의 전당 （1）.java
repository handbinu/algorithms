import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int l = score.length;
        int[] answer = new int[l];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<l;i++){
            if(minHeap.size() > k - 1 && score[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(score[i]);
                answer[i] = minHeap.peek();
            } else if (minHeap.size() <  k) {
                minHeap.offer(score[i]);
                answer[i] = minHeap.peek();                
            } else {
                answer[i] = minHeap.peek();  
            }
        }
        return answer;
    }
}