import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length+1];
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++)
            map.put(players[i], i);
        
        // System.out.println(map);
        for (String calling: callings) {
            int targetValue = map.get(calling);   // 3
            
            String frontPlayer = players[targetValue-1];
            
            players[targetValue] = frontPlayer;
            players[targetValue-1] = calling;
            
            map.put(calling, targetValue-1);
            map.put(frontPlayer, targetValue);
        }
        
        
        return players;
    }
}