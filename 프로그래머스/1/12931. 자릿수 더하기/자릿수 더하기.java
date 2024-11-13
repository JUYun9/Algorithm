import java.util.*;

public class Solution {
    public int solution(int N) {
        int answer = 0;

        while (N > 9) {
            answer += N % 10;
            N /= 10;
        }
        answer += N;

        return answer;
    }
}