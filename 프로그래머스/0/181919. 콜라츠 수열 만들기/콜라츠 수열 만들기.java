import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int [] nums =new int[1000];
        nums[0] = n;
        
        while(n!= 1){
            if(n%2 == 0 ){
                n = n/2;
                cnt++;
                nums[cnt] = n;
                continue;
            } else if(n%2 == 1){
                n=n*3+1;
                cnt++;
            nums[cnt] = n;
                continue;
            }
        }
        
        int[] answer = Arrays.copyOf(nums,cnt+1); 
                return answer;
        }
    }
