import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (queue.isEmpty() || queue.peekLast() != arr[i])
                // queue.push(arr[i]);
                queue.addLast(arr[i]);
        }
        
        int k = 0;
        int[] answer = new int[queue.size()];
        while (!queue.isEmpty())
            answer[k++] = queue.pollFirst();
        
        return answer;
    }
}