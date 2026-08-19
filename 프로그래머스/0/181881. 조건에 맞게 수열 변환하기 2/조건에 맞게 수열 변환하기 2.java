class Solution {
    public int solution(int[] arr) {
        int x = 0;
        
        while(true){
            boolean Change = false;
            for(int i =0;i<arr.length;i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    arr[i] = arr[i] / 2;
                    Change = true;
                } else if(arr[i]<50&&arr[i]%2!=0){
                    arr[i] = arr[i] * 2 + 1;
                    Change = true;                    
                }
            }
            if(!Change){
                break;
            }
            x++;
        }
        return x;
    }
}