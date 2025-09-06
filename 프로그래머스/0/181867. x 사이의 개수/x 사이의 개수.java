import java.io.*;


class Solution {
    public int[] solution(String myString) {
        String[] cut = myString.split("x");
        String cutString = myString.replaceAll("[^x]","");
        int[] answer = new int[cutString.length()+1];        
        
        for( int i= 0; i< cut.length; i++){
            answer[i] = cut[i].length();   
        }
        return answer;
    }
}