import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        LinkedList<Integer> list = new LinkedList<>();
        
        int count = arr.length;
        while (count-- > 0) {
            if (arr[count]%divisor == 0)
                list.add(arr[count]);
        }
        
        if (list.isEmpty())
            list.add(-1);
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
            
        return answer;
    }
}