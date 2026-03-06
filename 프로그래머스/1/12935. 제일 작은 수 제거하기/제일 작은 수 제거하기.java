import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num: arr) {
            if (num == min)
                continue;
            list.add(num);
        }
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        
        
        return answer;
    }
}