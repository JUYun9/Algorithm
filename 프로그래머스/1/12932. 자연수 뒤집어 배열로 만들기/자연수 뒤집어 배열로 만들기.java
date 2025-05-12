class Solution {
    public long[] solution(long n) {
        long[] answer = new long[String.valueOf(n).length()];
        
        int k = 0;
        while (n != 0) {
            answer[k++] = n % 10;
            n /= 10;
        }
        
        return answer;
    }
}
// 12345 -> 5
// 1234 -> 4
// 123 -> 3
// 12 -> 2
// 1 -> 