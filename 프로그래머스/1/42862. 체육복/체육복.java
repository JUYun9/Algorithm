import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int count = n - lost.length;
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    count++;
                    reserve[i] = -1;
                    lost[j] = -1;
                }
            }
        }
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]-1 || reserve[i] == lost[j]+1) {
                    count++;
                    reserve[i] = -1;
                    lost[j] = -1;
                }

            }
        }
       
        
        return count;
    }
}