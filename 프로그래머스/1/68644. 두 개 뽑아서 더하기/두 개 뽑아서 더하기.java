import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> answer = new LinkedList<>();
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                answer.add(num);
            }
        }
        
        Collections.sort(answer);
        for (int i = 0; i < answer.size()-1; i++) {
            if (answer.get(i).equals(answer.get(i+1))) {
                answer.remove(i);
                i--;
            }
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        
        return result;
    }
}