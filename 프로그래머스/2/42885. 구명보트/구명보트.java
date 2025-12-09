import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        boolean[] picked = new boolean[people.length];
        
        int front = 0;
        int end = people.length-1;
        for (int i = 0; i < people.length; i++) {
            if (front >= end)
                break;
            
            int target1 = people[front];
            int target2 = people[end];
            
            if (target1 + target2 > limit) {
                end--;
                continue;
            }
            
            answer++;
            picked[front] = true;
            picked[end] = true;
            
            front++;
            end--;
        }
        
        for (int i = 0; i < people.length; i++) {
            if (picked[i] == false)
                answer++;
        }
        
        return answer;
    }
}