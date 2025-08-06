class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(((i+1)*6)%n==0){
                answer = i+1;
                break;
            } else if (((i+1)*6)%n!=0){
                continue;
            }
        }
        return answer;
    }
}