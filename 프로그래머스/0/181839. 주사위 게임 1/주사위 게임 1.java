import java.io.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean Aev = (a%2 == 1) ? true : false;
        boolean Bev = (b%2 == 1) ? true : false;
        
        
        answer = (Aev&&Bev) ? (a*a + b*b) : (Aev || Bev) ? 2*(a+b) : Math.abs(a-b);

        return answer;
    }
}