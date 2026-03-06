class Solution {
    public String solution(String s) {
        String answer = "";
        
        int size = s.length();
        if (size%2 == 1)
            return String.valueOf(s.charAt(s.length()/2));
        answer = String.valueOf(s.charAt(s.length()/2-1)) + String.valueOf(s.charAt(s.length()/2));
        return answer;
    }
}