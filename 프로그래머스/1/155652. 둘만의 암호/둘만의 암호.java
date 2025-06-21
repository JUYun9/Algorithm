class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  
            for (int j = 0 ; j < index; j++) {
                if (ch == 'z')
                    ch = 'a';
                else
                    ch += 1;
                
                if (skip.contains(String.valueOf(ch)))
                    j--;
            }
            answer += ch;
        }
        
        return answer;
    }
}

/*

char c = 'a';
        int num = c - '0';
        System.out.println(num);
        
        char ch = (char) (num + '0' + 5);
        System.out.println(ch);
        
*/
