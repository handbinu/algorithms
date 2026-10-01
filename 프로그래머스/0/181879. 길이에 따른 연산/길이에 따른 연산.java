class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        int len = num_list.length;
        if(len >= 11){
            for(int i = 0;i<len;i++){
                count += num_list[i];
            };
            return count;
        }
        count=1;
        for(int i = 0;i<len;i++){
            count *= num_list[i];
        }
        return count;
    }
}