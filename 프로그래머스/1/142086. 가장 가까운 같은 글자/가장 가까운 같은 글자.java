class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        
        int k = 0;
        answer[k++] = -1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i-1; j >= 0; j--) {
                if (c == s.charAt(j)) {
                    answer[k++] = i-j;
                    break;
                }
            }
            if (answer[i] == 0)
                answer[k++] = -1;
        }
        
        return answer;
    }
}