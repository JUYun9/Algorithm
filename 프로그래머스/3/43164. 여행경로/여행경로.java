import java.util.*;

class Solution {
    
    private static List<String> ans;
    private static boolean[] vis;
    
    public String[] solution(String[][] tickets) {

        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        
        vis = new boolean[tickets.length];
        ans = new ArrayList<>();
        
        ans.add("ICN");
        
        dfs("ICN", tickets);
        
        String[] answer = new String[ans.size()]; 
        for (int i = 0; i < answer.length; i++)
            answer[i] = ans.get(i);
        
        return answer;
    }
    
    public boolean dfs(String cur, String[][] tickets) {
        if (ans.size() == tickets.length+1)
            return true;
        
        for (int i = 0; i < tickets.length; i++) {
            String departure = tickets[i][0];
            String destination = tickets[i][1];
            if (!vis[i] && cur.equals(departure)) {
                vis[i] = true;
                ans.add(destination);
                
                if (dfs(destination, tickets))
                    return true;
                
                vis[i] = false;
                ans.remove(ans.size()-1);
            }
        }
        
        return false;
    }
}

// 14:53 ~