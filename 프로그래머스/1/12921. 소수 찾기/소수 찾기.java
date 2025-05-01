class Solution {
    public int solution(int n) {
        
        if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        
        int answer = 2;
        
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j*j < i; j++) {
                if (i%j == 0)
                    break;
                
                if ((j+1) * (j+1) > i) {
                    // System.out.println(i);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}