import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                vis[i] = true;
                
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    for (int j = 0; j < n; j++) {
                        if (computers[cur][j] == 1 && !vis[j]) {
                            vis[j] = true;
                            queue.add(j);
                        }     
                    }
                }
                
                answer++;
            }    
        }
        
        return answer;
    }
}