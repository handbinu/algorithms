class Solution {
    public int solution(int[] num_list) {        
        int mul = 1, pow = 0;
        for(int n:num_list){
            mul *= n;
            pow += n;
        }
        return (mul < pow * pow) ? 1 : 0;
    }
}