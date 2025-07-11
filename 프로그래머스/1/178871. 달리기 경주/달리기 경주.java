import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String name: callings) {
            int current = map.get(name);
            String front = players[current-1];
            
            map.put(name, current-1);
            map.put(front, current);
            
            players[current-1] = name;
            players[current] = front;
        }
        
        return players;
    }
}