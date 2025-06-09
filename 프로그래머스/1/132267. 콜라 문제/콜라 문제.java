class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int k = n/a;
            answer += k*b;
            
            n = n%a + k*b;
        }
        
        return answer;
    }
}

