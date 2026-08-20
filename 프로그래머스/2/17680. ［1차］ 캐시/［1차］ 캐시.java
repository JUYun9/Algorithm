import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0)
            return 5 * cities.length;
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (list.size() < cacheSize) {
                if (list.contains(city)) {
                    list.remove(city);
                    list.add(city);
                    answer++;
                }
                else {
                    list.add(city);
                    answer += 5;
                }
            } else if (list.size() == cacheSize) {
                if (list.contains(city)) {
                    list.remove(city);
                    list.add(city);
                    answer++;
                } else {
                    list.remove(0);
                    list.add(city);
                    answer += 5;
                }
            }
        }
    
        return answer;
    }
}

// 15:22