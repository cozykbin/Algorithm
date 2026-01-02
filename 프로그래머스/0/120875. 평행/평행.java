class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double gi12 = ((double)dots[1][1]-dots[0][1])/(dots[1][0]-dots[0][0]);
         double gi13 = ((double)dots[2][1]-dots[0][1])/(dots[2][0]-dots[0][0]);
         double gi14 = ((double)dots[3][1]-dots[0][1])/(dots[3][0]-dots[0][0]);
         double gi23 = ((double)dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0]);
         double gi24 = ((double)dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]);
         double gi34 = ((double)dots[3][1]-dots[2][1])/(dots[3][0]-dots[2][0]);
                             
            if(gi12 == gi34){
              answer = 1;
            }if(gi13 == gi24){
              answer = 1;
            }if(gi14 == gi23){
              answer = 1;
            }
                             
                             
        
        
        
        return answer;
    }
}