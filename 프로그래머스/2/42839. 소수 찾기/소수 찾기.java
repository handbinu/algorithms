import java.util.*;
class Solution {
    HashSet<Integer> set = new HashSet<>();
    int len;
    public int solution(String numbers) {
        len = numbers.length();
        boolean[] visited = new boolean[len];
        
        dfs(numbers, "", visited);
        
        int answer = 0;
        for(int num: set){
            if(isPrime(num)) answer++;
        }
        return answer;
    }
    public void dfs(String numbers, String current, boolean[] visited){
        if(!current.isEmpty()){
            set.add(Integer.parseInt(current));
        }
        
        for(int i=0;i<len;i++){
            if(visited[i] == true) {continue;}
            visited[i] =true;
            dfs(numbers, current + numbers.charAt(i), visited);
            visited[i] = false;
        }
    }
    public boolean isPrime(int num){
        if(num <= 1) {return false;}
        for(int i = 2;i * i <= num;i++){
            if(num % i == 0) {return false;}
        }
        return true;
    }
}