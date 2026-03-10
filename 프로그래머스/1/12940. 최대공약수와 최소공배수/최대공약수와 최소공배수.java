class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(m, n);
        answer[0] = gcd;
        
        answer[1] = n * m / gcd;
        
        return answer;
    }
    
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        if (a%b == 0)
            return b;
        
        int tmp = a;
        a = b;
        b = tmp%b;
        
        return gcd(a, b);
    }
}