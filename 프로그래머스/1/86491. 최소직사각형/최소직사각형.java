class Solution {
    public int solution(int[][] sizes) {
        int width = 0, length = 0;
        for(int[] sizing: sizes){
            width = Math.max(width, Math.max(sizing[0], sizing[1])); 
            length = Math.max(length, Math.min(sizing[0], sizing[1]));
        }
        return width * length;
    }
}