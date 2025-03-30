// 01:06
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] exist = new boolean[10];
        for (int i  = 0; i < numbers.length; i++) {
            int validIndex = numbers[i];
            exist[validIndex] = true;
        }
        
        for (int i = 0; i < 10; i++) {
            if (!exist[i])
                answer += i;
        }
        
        return answer;
    }
}