class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        int num_p = 0;
        int num_y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                num_p++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                num_y++;
        }
        
        if (num_p == num_y)
            return answer;
        else
            return !answer;
    }
}