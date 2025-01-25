class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double rootN = Math.sqrt(n);
        
        for (long i = 1; i <= rootN; i++) {
            if (i == rootN) {
                answer = (i+1)*(i+1);
                return answer;
            }
        }
        
        return answer;
    }
}