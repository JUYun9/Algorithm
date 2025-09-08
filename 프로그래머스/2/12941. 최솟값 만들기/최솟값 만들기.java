import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int arrSize = A.length;
        for (int i = 0; i < arrSize; i++) {
            int num = A[i] * B[arrSize-1-i];
            answer += num;
        }

        return answer;
    }
}