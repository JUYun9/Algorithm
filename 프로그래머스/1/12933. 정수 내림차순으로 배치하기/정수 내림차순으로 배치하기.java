import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        Queue<Long> q = new LinkedList<>();
        
        while (n != 0) {
            q.add(n%10);
            n /= 10;
        }
        
        int size = q.size();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = q.peek();
            q.poll();
        }
        
        Arrays.sort(arr);
        
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                answer *= 10;
            else {
                answer += arr[i] * k;
            }
            k *= 10;
        }
        
        return answer;
    }
}