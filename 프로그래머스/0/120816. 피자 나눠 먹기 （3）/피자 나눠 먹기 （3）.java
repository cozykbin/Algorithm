class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        int a = n/slice;
        
        
        while((a*slice) <n) {
            a++;           
        }
        
        answer = a;
        
        return answer;
    }
}