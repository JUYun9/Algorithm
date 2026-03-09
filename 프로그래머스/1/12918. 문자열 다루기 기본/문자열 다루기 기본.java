class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6)
            return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch - '0' > 10)
                return false;
        }
        
        return answer;
    }
}