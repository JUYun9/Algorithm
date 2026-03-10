class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append(" ");
                index = 0;
            }
            else {
                sb.append(index%2==0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                index++;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}