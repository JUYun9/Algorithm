// 12:44 ~ 
import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int size = s.length();
        if (size%2 == 0)
            sb.append(s.charAt(size/2 - 1)).append(s.charAt(size/2));
        else
            sb.append(s.charAt(size/2));
            
        answer = sb.toString();
        
        return answer;
    }
}