class Solution {
    public String solution(String n_str) {
        int cnt = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) == '0'){
                cnt++;
            }else if(n_str.charAt(i) !='0'){
                break;
            }
        }
        n_str.substring(cnt);
        
        return n_str.substring(cnt);
    }
}