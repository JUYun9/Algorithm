import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < arr1.length; i++) {
            
            Stack<Integer> stk = new Stack<>();
            
            int count = 0;
            while (count < n) {
                int num1 = arr1[i] % 2;
                int num2 = arr2[i] % 2;
                if (num1==0 && num2==1)
                    stk.add(num2);
                else
                    stk.add(num1);
                
                arr1[i] /= 2;
                arr2[i] /= 2;
                
                count++;
            }
            
            StringBuilder sb = new StringBuilder();
            while (!stk.isEmpty()) {    
                int k = stk.pop();
                
                if (k == 1)
                    sb.append("#");
                else
                    sb.append(" ");
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}