class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((int) ch != 32) {
                int num = (int) ch;
                int transfer = num + n;

                if (num >= 65 && num <= 90 && transfer > 90)
                    transfer -= 26;
                else if (num >= 97 && num <= 122 && transfer > 122)
                    transfer -= 26;
                
                sb.append((char) transfer);
            } else
                sb.append(ch);
        }
        
        return sb.toString();
    }
}