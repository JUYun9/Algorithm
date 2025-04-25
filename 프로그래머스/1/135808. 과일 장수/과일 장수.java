import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int num = k;
        int count = 0;
        while (true) {
            for (int i = 0; i < score.length; i++) {
                if (score[i] == num)
                    count++;
                
                if (count == m) {
                    answer += num * count;
                    count = 0;
                }
            }
            
            num--;
            if (num == 0)
                break;
        }
        
        return answer;
    }
}