import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<A> q = new LinkedList<>();
        
        q.add(new A(0, 0));
        
        while (!q.isEmpty()) {
            A cur = q.poll();
            if (cur.idx == numbers.length) {
                if (cur.sum == target)
                    answer++;
                continue;
            }
            
            q.add(new A(cur.idx+1, cur.sum+numbers[cur.idx]));
            q.add(new A(cur.idx+1, cur.sum-numbers[cur.idx]));
        }
        
        return answer;
    }
}

class A {
    int idx;
    int sum;
    A(int idx, int sum) {
        this.idx = idx;
        this.sum = sum;
    }
}