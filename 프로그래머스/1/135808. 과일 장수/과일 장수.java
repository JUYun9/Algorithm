import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int q = 1;   // 묶음인데 이거는 필요없을듯
        int count = 0;
        for (int i = score.length-1; i >= 0; i--) {
            count++;
            if (count == m) {
                answer += score[i] * m;
                count = 0;
            }
        }
        
        
        
        return answer;
    }
}


// 사과는 상자 단위로만 판매한다.
// 사과의 점수는 1점 ~ k점
// m개씩 담는다.