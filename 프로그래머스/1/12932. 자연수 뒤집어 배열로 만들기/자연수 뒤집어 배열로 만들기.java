import java.util.*;

class Solution {
    public Queue<Long> solution(long n) {
        Queue<Long> q = new LinkedList<>();
        while (n > 0) {
            long num = n%10;
            q.add(num);
            n /= 10;
        }
        
        return q;
    }
}