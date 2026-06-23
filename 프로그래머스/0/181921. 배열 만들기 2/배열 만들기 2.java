import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            String remove = String.valueOf(i).replace("0", "").replace("5", "");
            
            if(remove.isEmpty()){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}