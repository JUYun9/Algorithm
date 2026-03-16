class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            int num;
            if (target == ' ') {
                sb.append(" ");
                continue;
            } else if (Character.isLowerCase(target))
                    num = (target - 'a' + n) % 26 + 'a';
            else
                num = (target - 'A' + n) % 26 + 'A';
            
            sb.append((char) num);
        }
        
        return sb.toString();
    }
}