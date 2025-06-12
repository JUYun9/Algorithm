import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int temporaryLength = commands[i][1] - commands[i][0] + 1;
            int[] temporary = new int[temporaryLength];
            for (int j = 0; j < temporaryLength; j++) {
                temporary[j] = array[commands[i][0] + j - 1];
            }
            
            Arrays.sort(temporary);
            
            answer[i] = temporary[commands[i][2]-1];
            
        }
        
        return answer;
    }
}