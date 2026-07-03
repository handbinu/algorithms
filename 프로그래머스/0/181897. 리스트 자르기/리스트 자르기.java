import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n) {
            case 1: answer= Arrays.copyOfRange(num_list, 0, slicer[1]+1); break;
            case 2: answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length); break;
            case 3: answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1); break;
            case 4: answer = IntStream.range(slicer[0], slicer[1]+1)
                                            .filter(i -> (i - slicer[0]) % slicer[2] == 0)
                                            .map(i->num_list[i])
                                            .toArray();
            break;
        }
        return answer;
    }
}