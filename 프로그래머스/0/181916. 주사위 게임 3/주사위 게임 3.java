class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        int answer = 0, p = 0;
        int maxCount = 0;
        for(int i = 1;i<7;i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                p = i;
            }
        }
        if(maxCount == 4){
            answer = p * 1111;
        } else if(maxCount == 3){
            for(int i = 1;i<7;i++){
                if(count[i] == 1){
                    answer = (10*p+i)*(10*p+i);
                }
            }
        }else if(maxCount == 2){
            int q = 0;
            for(int i = 1;i<7;i++){
                if(count[i] == 2 && i != p){
                    q = i;
                }
            }
            if(q != 0){
                answer = (p + q) * Math.abs(p-q);
            }else{
                int score = 1;
                for(int i = 1;i<7;i++){
                    if(count[i] == 1){
                        score *= i;
                    }
                }
                answer = score;
            }
        }else{
            for(int i = 1;i<7;i++){
                if(count[i] == 1){
                    answer = i;
                    break;
                }
            }
        }
    
        return answer;
    }
}