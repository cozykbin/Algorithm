import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int cnt = 0;
        int len = my_string.length();
        char[] cut = new char[len+1]; 
           for(int i = 0; i < len ; i++){
             cut[i] =  my_string.substring(i).charAt(0);
                 char a = cut[i];
               if(Character.isDigit(a)){
                   answer = answer+ a-48;
                 System.out.println(a);

               }

           }
        return answer;
    }
}