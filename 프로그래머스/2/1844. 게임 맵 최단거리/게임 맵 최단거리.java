import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        
        boolean[][] vis = new boolean[maps.length][maps[0].length];    
        Queue<int[]> queue = new LinkedList<>();
        
        vis[0][0] = true;
        queue.add(new int[] {0, 0, 1});   // x, y, count

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                if (nx<0 || ny<0 || nx>maps.length-1 || ny>maps[0].length-1)
                    continue;
                if (vis[nx][ny] || maps[nx][ny]==0)
                    continue;
                    
                if (nx==maps.length-1 && ny==maps[0].length-1)
                    return count+1;
                
                vis[nx][ny] = true;
                queue.add(new int[] {nx, ny, count+1});
            }
        }
        
        return answer;
    }
}