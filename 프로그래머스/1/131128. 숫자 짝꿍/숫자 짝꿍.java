import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            char target = X.charAt(i);
            countX[target - '0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            char target = Y.charAt(i);
            countY[target - '0']++;
        }
        
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int minValue = Math.min(countX[i], countY[i]);
            for (int j = 0; j < minValue; j++) {
                list.add(i);
            }
        }
        
        if (list.isEmpty())
            return "-1";
        else {
            list.sort(Comparator.reverseOrder());
            if (list.peekFirst() == 0)
                return "0";
            else {
                StringBuilder sb = new StringBuilder();
                for (int num: list) {
                    sb.append(String.valueOf(num));
                }
                
                answer = sb.toString();
            }
        }
        
        return answer;
    }
}