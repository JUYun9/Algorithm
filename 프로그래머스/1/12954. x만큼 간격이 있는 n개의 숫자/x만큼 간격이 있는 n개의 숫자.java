class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int i = 0;
        int plus = x;
        while (i < n) {
            answer[i] = x;
            x += plus;
            i++;
        }
        
        return answer;
    }
}