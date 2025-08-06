class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        int c = 0;
        
        b = denom1*denom2;
        a = (denom2*numer1) + (denom1*numer2);
        c = Math.max(a,b); 
        
        for (int i = 0; i <c; i++ ){
            if( (c-i)!=0 && a%(c-i) == 0 && b%(c-i) == 0){
                a /= (c-i);
                b /= (c-i);
            }
        }    
        
        answer[0]=a;
        answer[1]=b;
        
        
        
        
        return answer;
    }
}