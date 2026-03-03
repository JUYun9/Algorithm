class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int q = 2; q < n; q++) {
            if (n%q == 1)
                return q;
        }
        
        return answer;
    }
}