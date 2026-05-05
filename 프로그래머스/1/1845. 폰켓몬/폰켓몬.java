import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int numMax = nums.length;
        int select = numMax/2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i < numMax;i++){
            set.add(nums[i]);
        }
        
        int answer = Math.min(select, set.size());
        return answer;
    }
}