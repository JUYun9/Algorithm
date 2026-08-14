import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        // 인접리스트 생성 및 초기화
        List<Integer>[] adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++)
            adj[i] = new ArrayList<>();
        
        // 인접리스트에 값 넣기
        for (int[] e: edge) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        
        // 노드에서 떨어진 거리를 담는 배열
        int[] dist = new int[n+1];
        for (int i = 0; i < dist.length; i++)
            dist[i] = -1;
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        dist[1] = 0;
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int v: adj[cur]) {
                if (dist[v] != -1)
                    continue;
                
                dist[v] = dist[cur] + 1;
                queue.add(v);
            }
        }
        
        int max = -1;
        for (int d: dist) {
            if (d > max)
                max = d;
        }

        for (int d: dist) {
            if (d == max)
                answer++;
        }
            
        return answer;
    }
}