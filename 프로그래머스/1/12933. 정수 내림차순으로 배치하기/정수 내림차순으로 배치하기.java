import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        Queue<Long> queue = new PriorityQueue<>();
        while (n > 0) {
            long num = n % 10;
            queue.add(num);
            n /= 10;
        }
        
        int q = 1;
        while (!queue.isEmpty()) {
            answer += q*queue.poll();
            q *= 10;
        }
        
        return answer;
    }
}