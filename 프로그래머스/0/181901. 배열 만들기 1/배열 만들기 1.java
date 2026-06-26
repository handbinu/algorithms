import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList();
        for(int i = 1;i*k<=n;i++){
            list.add(i*k);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}