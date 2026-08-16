import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        List<int[]>[] graph = new ArrayList[N+1];
        for (int i = 0; i <= N; i++)
            graph[i] = new ArrayList<>();
        
        for (int i = 0; i < road.length; i++) {
            int[] target = road[i];
            graph[target[0]].add(new int[] {target[1], target[2]});
            graph[target[1]].add(new int[] {target[0], target[2]});
        }
        
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.offer(new int[] {1,0});
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int weight = cur[1];
            
            if (weight > dist[node])
                continue;
            
            for (int[] next: graph[node]) {
                int nextNode = next[0];
                int nextWeight = next[1] + weight;
                
                if (nextWeight < dist[nextNode]) {
                    dist[nextNode] = nextWeight;
                    pq.offer(new int[] {nextNode, nextWeight});
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K)
                answer++;
        }

        return answer;
    }
}