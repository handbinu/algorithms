import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] abcSort = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] abcOk = {0, 0, 0};
        
        for(int i = 0; i<3;i++){
            for(int j = 0;j<answers.length;j++){
                if(abcSort[i][j % abcSort[i].length] == answers[j]){
                    abcOk[i]++; 
                }
            }
        }
        int max = Math.max(abcOk[0], Math.max(abcOk[1], abcOk[2]));
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0;i<3;i++){
            if(max == abcOk[i]){
                answerList.add(i+1);
            }
        }
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}