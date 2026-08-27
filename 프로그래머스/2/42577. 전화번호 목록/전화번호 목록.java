import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for (int i = 1; i < phone_book.length; i++) {
            String prev = phone_book[i-1];
            String cur = phone_book[i];
            
            if (prev.length() > cur.length())
                continue;
            if (cur.substring(0, prev.length()).equals(prev))
                return false;
        }
        
        return answer;
    }
}