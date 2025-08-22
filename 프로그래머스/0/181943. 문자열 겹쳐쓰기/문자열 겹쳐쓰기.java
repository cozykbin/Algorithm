import java.io.*;
import java.util.*;


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] wow = new char[my_string.length()];
        wow = my_string.toCharArray();
        
        
        for(int i = 0; i < overwrite_string.length(); i++){
            wow[s+i] = overwrite_string.charAt(i);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            answer+= wow[i];
        }

        // String del = my_string.substring(s,s+overwrite_string.length());     
        // answer += my_string.replace(del, overwrite_string);
        
        return answer;
    }
}