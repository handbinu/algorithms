class Solution {
    String[] dic = {"A", "E", "I", "O", "U"};
    int count = 0;
    int answer = 0;
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    void dfs(String cur, String target){
        if(cur.length() > 5) return;
        if(!cur.isEmpty()){
            count++;
            if(cur.equals(target)){
                answer = count;
                return;
            }
        }
        for(String n:dic){
            if(answer != 0) return;
            dfs(cur+n, target);
        }
    }
}