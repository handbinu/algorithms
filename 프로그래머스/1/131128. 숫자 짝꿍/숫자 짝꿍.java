class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for(int i = 0;i<X.length();i++){
            countX[X.charAt(i) - '0']++;
        }
        
        for(int i = 0;i<Y.length();i++){
            countY[Y.charAt(i) - '0']++;
        }
        
    
        StringBuilder sb = new StringBuilder();
        for(int i=9;i>=0;i--){
            int rowCount = Math.min(countX[i], countY[i]);
            for(int j=0; j < rowCount; j++){
                sb.append(i);
            }
        }
        String answer = sb.toString();
    
        
        if(answer.isEmpty()) return "-1";
        if(answer.startsWith("0")) return "0";
        
        return answer;
    }
}