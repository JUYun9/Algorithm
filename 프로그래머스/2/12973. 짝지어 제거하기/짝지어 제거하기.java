import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = -1;

        // System.out.println("Hello Java");

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            
            boolean flag = false;
            if (!stack.isEmpty()) {
                if (target == stack.peek()) {
                    stack.pop();
                    flag = true;   
                }
            }
            
            if (!flag)
                stack.push(target);
            
        }
        
        if (stack.isEmpty())
            return 1;
        else
            return 0;
        
    }
}