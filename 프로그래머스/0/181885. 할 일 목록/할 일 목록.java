import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> fallList = new ArrayList<>();
        for(int i = 0;i<todo_list.length;i++){
            if(!finished[i]){
                fallList.add(todo_list[i]);
            }
        }
        return fallList.toArray(new String[0]);
    }
}