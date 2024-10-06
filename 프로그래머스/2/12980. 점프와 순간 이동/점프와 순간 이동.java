import java.util.*;

public class Solution {
    public int solution(int N) {
        int ans = 0;

        while (N > 1) {
            if (N%2 == 1)
                ans++;
            N /= 2;
        }
        ans++;
        
        return ans;
    }
}