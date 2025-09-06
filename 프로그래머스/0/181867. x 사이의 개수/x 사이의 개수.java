import java.io.*;


class Solution {
    public int[] solution(String myString) {
        String[] cut = myString.split("x");
        String cutString = myString.replace("a","").replace("b","").replace("c","").replace("d","").replace("e","").replace("f","").replace("g","").replace("h","").replace("i","").replace("j","").replace("k","").replace("l","").replace("m","").replace("n","").replace("o","").replace("p","").replace("q","").replace("r","").replace("s","").replace("t","").replace("u","").replace("v","").replace("w","").replace("y","").replace("z","");
        int[] answer = new int[cutString.length()+1];        
        
        for( int i= 0; i< cut.length; i++){
            answer[i] = cut[i].length();   
        }
        return answer;
    }
}