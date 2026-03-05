class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (target == 'p' || target == 'P')
                count++;
            else if (target == 'y' || target == 'Y')
                count--;
        }
        
        if (count != 0)
            answer = false;

        return answer;
    }
}