import java.util.*;

class Solution {
    
    private static Map<Character, Integer> map;
    
    public int solution(String dirs) {
        int answer = 0;
        
        map = new HashMap<>();
        map.put('U', 0); map.put('R', 1); map.put('D', 2); map.put('L', 3);

        boolean[][][] vis = new boolean[16][16][4];
            
        int dx = 0; int dy = 0;
        for (int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);

            if (dir == 'U') {
                if (!isValidRange(dx, dy, dir))
                    continue;
                
                if (!vis[dx+5][dy+5][map.get(dir)]) {
                    vis[dx+5][dy+5][map.get(dir)] = true;
                    vis[dx+5][dy+6][map.get('D')] = true;
                    answer++;    
                }
                
                dy += 1;
            }
            else if (dir == 'D') {
                if (!isValidRange(dx, dy, dir))
                    continue;
                
                if (!vis[dx+5][dy+5][map.get(dir)]) {
                    vis[dx+5][dy+5][map.get(dir)] = true;
                    vis[dx+5][dy+4][map.get('U')] = true;
                    answer++;
                }
                
                dy -= 1;
            }
            else if (dir == 'L') {
                if (!isValidRange(dx, dy, dir))
                    continue;
                
                if (!vis[dx+5][dy+5][map.get(dir)]) {
                    vis[dx+5][dy+5][map.get(dir)] = true;
                    vis[dx+4][dy+5][map.get('R')] = true;
                    answer++;
                }
                
                dx -= 1;
             }
            else {
                if (!isValidRange(dx, dy, dir))
                    continue;
                
                if (!vis[dx+5][dy+5][map.get(dir)]) {
                    vis[dx+5][dy+5][map.get(dir)] = true;
                    vis[dx+6][dy+5][map.get('L')] = true;
                    answer++;
                }
                
                dx += 1;
            }
        }
        
        return answer;
    }
    
    private boolean isValidRange(int x, int y, char dir) {
        int num = map.get(dir);
        
        if (num == 0)
            y++;
        else if (num == 1)
            x++;
        else if (num == 2)
            y--;
        else
            x--;
        
        if (x>5 || y>5 || x<-5 || y<-5)
            return false;
        
        return true;
    }
}