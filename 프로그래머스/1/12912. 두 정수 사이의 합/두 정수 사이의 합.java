class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int tmp = b;
        if (a > b) {
            b = a;
            a = tmp;
        }
        
        for (int i = a; i <= b; i++)
            answer += i;
        
        return answer;
    }
}