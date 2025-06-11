import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        LinkedList<Integer> rank = new LinkedList<>(); // push도 되나? 되는 것 같긴한데
        int t = 0;
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            
            Collections.sort(rank);
            
            if (rank.size() > k)
                rank.removeFirst();
            
            answer[t++] = rank.peekFirst();
        }
        
        return answer;
    }
}