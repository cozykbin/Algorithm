class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = 0;
        int ch =0;
        
    
        cup = money/5500;
        ch = money - (cup*5500);
        
        answer[0] = cup;
            answer[1] = ch;
    
        return answer;
    }
}