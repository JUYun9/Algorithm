import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        boolean[] bool = new boolean[200];
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (bool[sum])
                    continue;
                
                list.add(sum);
                
                bool[sum] = true;
            }
        }
        
        int[] answer = new int[list.size()];
        
        int i = 0;
        for (int num: list)
            answer[i++] = num;
        
        Arrays.sort(answer);
        
        return answer;
    }
}