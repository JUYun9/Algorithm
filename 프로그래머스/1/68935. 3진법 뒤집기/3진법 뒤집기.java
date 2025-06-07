import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        int digit = n;
        while (digit > 0) {
            count++;
            digit /= 10;
        }
        
        // 3진법으로 변환
        Stack<Integer> stk = new Stack<>();
        
        while (n != 0) {
            int k = n%3;
            stk.add(k);
            
            n /= 3;
        }
        
        /*
        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
        */
        
        int i = 1;
        while (!stk.isEmpty()) {
            int num = stk.peek();
            while (num -- > 0)
                answer += i;
            
            stk.pop();
            i *= 3;
        }
        return answer;
    }
}