class Solution {
    public int solution(int hp) {
        
        int da = hp/5;
        int na = hp%5;
        
        int answer = 0;
        int da3 = na/3;
        int na3 = na%3;
        answer = answer + da + da3 + na3;
        return answer;
    }
}