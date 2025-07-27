class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
       String[] longArr =  (s1.length > s2.length ) ? s1 : s2; 
        String[] shortArr =  (longArr == s1 ) ? s2 : s1; 
        
        for(int i = 0; i < longArr.length; i++){
            for(int j = 0; j < shortArr.length; j++){
            if(shortArr[j].equals(longArr[i])) {
                answer++;
            }
            }
            
        }
        return answer;
    }
}