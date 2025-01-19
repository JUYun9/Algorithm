import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i) - '0';
        
        Arrays.sort(arr);
       
        long j = 1;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] * j;
            j *= 10;
        }
        return answer;
    }
}