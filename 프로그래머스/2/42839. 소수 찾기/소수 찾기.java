import java.util.*;
class Solution {
    int len;
    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        len = numbers.length();
        boolean[] check = new boolean[len];
        dfs(numbers, "", check);
        int answer = 0;
        for(int i : set){
            if(isPrime(i)){answer++;}
        }
        return answer;
    }
    public void dfs(String numbers, String current, boolean[] check){
        if(!current.isEmpty()){
            set.add(Integer.parseInt(current));
        }

        for(int i=0;i<len;i++){
            if(check[i]) continue;
            check[i]=true;
            dfs(numbers, current + numbers.charAt(i), check);
            check[i]=false;
        }
    }
    public boolean isPrime(int num){
        if(num <= 1 ){return false;}
        for(int i=2;i*i<=num;i++){
            if(num % i == 0) {return false;}
        }
        return true;
    }
}