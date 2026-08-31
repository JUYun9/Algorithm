import java.util.*;

class Solution {
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        Queue<int[]> queue = new ArrayDeque<>();
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        for (int[] r : rectangle) {
            r[0] *= 2;
            r[1] *= 2;
            r[2] *= 2;
            r[3] *= 2;
        }
        
        characterX *= 2; characterY *= 2; itemX *= 2; itemY *= 2;
        
        int x = 0, y = 0;
        for (int i = 0; i < rectangle.length; i++) {
            x = Math.max(x, rectangle[i][2]);
            y = Math.max(y, rectangle[i][3]);
        }
        
        int[][] board = new int[x+1][y+1];
        for (int i = 0; i < rectangle.length; i++) {
            for (int p = rectangle[i][0]; p <= rectangle[i][2]; p++) {
                for (int q = rectangle[i][1]; q <= rectangle[i][3]; q++) {
                    if (p == rectangle[i][0] || p == rectangle[i][2]
                        || q == rectangle[i][1] || q == rectangle[i][3]) {
                        if (board[p][q] == 0) {
                            board[p][q] = 1;
                            continue;
                        }
                    }
                    
                }
            }
        }
        
        for (int i = 0; i < rectangle.length; i++) {
            for (int p = rectangle[i][0]+1; p < rectangle[i][2]; p++) {
                for (int q = rectangle[i][1]+1; q < rectangle[i][3]; q++)
                    board[p][q] = 0;
            }
        }
        
        
        int[][] dist = new int[x+1][y+1];
        for (int[] row: dist)
            Arrays.fill(row, Integer.MAX_VALUE);
        
        queue.offer(new int[] {characterX, characterY, 0});
        dist[characterX][characterY] = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();            
            int nx = cur[0];
            int ny = cur[1];
            int d = cur[2];
            
            for (int dir = 0; dir < 4; dir++) {
                int x1 = nx + dx[dir];
                int y1 = ny + dy[dir];
                
                int ndist = d+1;
                if (x1<0 || y1<0 || x1>x || y1>y)
                    continue;
                if (board[x1][y1] == 0)
                    continue;
                if (x1==itemX && y1==itemY) {
                    return ndist/2;
                }
                if (ndist < dist[x1][y1]) {
                    dist[x1][y1] = ndist;
                    queue.offer(new int[] {x1, y1, ndist});  
                    continue;
                }
            }
        } 
        
        return dist[itemX][itemY];
    }
}

// 14:37 ~