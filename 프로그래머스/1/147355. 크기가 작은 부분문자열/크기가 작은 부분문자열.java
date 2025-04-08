import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        LinkedList<String> list = new LinkedList<>();
        
        int idx = 0;
        while (idx <= t.length()-p.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < p.length(); i++)
                sb.append(t.charAt(idx + i));
            
            idx++;
            list.add(sb.toString());
        }
        
        for (String s: list) {
            if (Long.parseLong(s) <= Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}