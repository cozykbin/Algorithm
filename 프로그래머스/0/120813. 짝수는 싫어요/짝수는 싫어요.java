class Solution {
    public int[] solution(int n) {
        int num;
        int a;
        
        if (n%2 ==0) {
            a = n/2;
        }else {a =(n+1)/2;}
        
        int[] answer = new int[a];
        
        for (int i = 0; i<a; i++){
            answer[i] = (i+1)*2-1;
            
        }
        
        
        
        return answer;
    }
}