class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int StartX = board[0]/2;
        
        int StartY = board[1]/2;
         System.out.println("답"+StartX+ " "+ StartY);
        
        int[][] moved = new int[keyinput.length+1][2];
        moved[0][0] = StartX;
        moved[0][1] = StartY;

        for(int i = 1; i <= keyinput.length; i++){
            if (keyinput[i-1].equals("down")){
                 int nextY = moved[i-1][1] -1;
                if(nextY>=0){
                    moved[i][0] = moved[i-1][0];
                    moved[i][1] = nextY;
                }else{
                    moved[i][0] = moved[i-1][0];
                    moved[i][1] = moved[i-1][1];
                }

                
            }else if (keyinput[i-1].equals("up")){
                 int nextY = moved[i-1][1] +1;
                if(nextY<board[1]){
                    moved[i][0] = moved[i-1][0];
                    moved[i][1] = nextY;
                }else{
                    moved[i][0] = moved[i-1][0];
                    moved[i][1] = moved[i-1][1];
                }

                
            }else if (keyinput[i-1].equals("left")){
                 int nextX = moved[i-1][0] -1;
                if(nextX>=0){
                    moved[i][1] = moved[i-1][1];
                    moved[i][0] = nextX;
                }else{
                    moved[i][1] = moved[i-1][1];
                    moved[i][0] = moved[i-1][0];
                }

                
            }else if (keyinput[i-1].equals("right")){
                 int nextX = moved[i-1][0] +1;
                if(nextX<board[0]){
                    moved[i][1] = moved[i-1][1];
                    moved[i][0] = nextX;
                }else{
                    moved[i][1] = moved[i-1][1];
                    moved[i][0] = moved[i-1][0];
                }

                
            }
            System.out.println(moved[i][0] + " "+ moved[i][1]);
            
        }
        
        
        System.out.println("답"+moved[keyinput.length][0] + " "+ moved[keyinput.length][1]);

        answer[0] = moved[keyinput.length][0]-StartX;
        answer[1] = moved[keyinput.length][1]-StartY;

        return answer;
    }
}