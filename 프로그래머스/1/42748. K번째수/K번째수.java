import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int idx = 0;
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            
            int[] tmp = new int[end-start+1];
            for (int j = 0; j < tmp.length; j++)
                tmp[j] = array[start-1+j];
            
            Arrays.sort(tmp);
            
            int targetIdx = commands[i][2] - 1;
            answer[idx++] = tmp[targetIdx];
        }
        
        return answer;
    }
}