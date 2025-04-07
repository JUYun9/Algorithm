// d: 부서별 신청한 금액
// budget: 예산
// answer: 최대 개수
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            answer += d[i];
            count++;
            if (answer > budget)
                return count-1;
        }
        
            
        return count;
    }
}

// sol1) 정렬
// sol2) 브루트 포스. 재귀