class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                index = 0;
                sb.append(" ");
            } else {
                if (index%2 == 1)
                    sb.append(Character.toLowerCase(c));
               else
                   sb.append(Character.toUpperCase(c));
            index++;
            }
        }
        
        
        return sb.toString();
    }
}