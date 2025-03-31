// 12:54 ~
import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue)
                minValue = arr[i];
        }
       
        int index = 0;
        int[] answer = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minValue)
                answer[index++] = arr[i];
        }
        
        return answer;
    }
}