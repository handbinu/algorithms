import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int i = 0, answer = 0, nTruck = 0, nTime = 1, nWeight = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        int[] inTimes = new int[truck_weights.length];
        
        while(i < truck_weights.length){
            if(bridge_length >= nTruck + 1 && weight >= nWeight + truck_weights[i]){
                nTruck++;
                nWeight += truck_weights[i];
                queue.offer(i);
                inTimes[i] = nTime;
                nTime++;
                i++;
            } else {
                int out = queue.poll();
                nTime = Math.max(nTime, inTimes[out] + bridge_length);
                nTruck--;
                nWeight -= truck_weights[out];
            }
        }
        return inTimes[truck_weights.length-1] + bridge_length;
    }
}