class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String sum = "";
        char[] al = myString.toCharArray();
        for(int i = 0; i < al.length ; i++){
            if(al[i] == 'A'){
                al[i] = 'B';
            }else if(al[i] == 'B'){
                al[i] = 'A';
            }
            
            sum += al[i];
        }
        
        
        if(sum.contains(pat)){
            answer = 1;
        }
        
        
        return answer;
    }
}