class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int i =0;i<num_list.length;i++){
            int x = num_list[i];
            while(x != 1){
                x/=2;
                count++;
            }
        }
        return count;
    }
}