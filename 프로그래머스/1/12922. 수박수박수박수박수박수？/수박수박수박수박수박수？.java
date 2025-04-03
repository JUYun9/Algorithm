// 16:09 ~
class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
           
        int j = 0;
        // String[] str = {"수", "박"};
        String[] str = new String[] {"수", "박"};
        for (int i = 0; i < n; i++) {
            answer.append(str[j++]);
            if (j == 2)
                j = 0;
        }
    
        return answer.toString();
    }
}