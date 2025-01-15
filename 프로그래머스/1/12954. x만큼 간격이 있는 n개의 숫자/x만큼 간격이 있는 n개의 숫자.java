class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        int i = 0;
        long plus = x;
        while (i < n) {
            answer[i] = x;
            x += plus;
            i++;
        }
        
        return answer;
    }
}