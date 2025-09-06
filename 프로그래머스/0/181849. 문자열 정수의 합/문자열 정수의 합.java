class Solution {
    public int solution(String num_str) {
		int[] nums = new int[num_str.length()];
		int answer = 0;

		for (int i = 0; i < num_str.length(); i++) {
			nums[i] = num_str.charAt(i) - '0';
			answer += nums[i];
        }
            return answer;
    }
}