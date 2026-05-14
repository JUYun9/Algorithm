import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for (int i = 0; i < choices.length; i++) {
            int number = choices[i];
            if (number <= 3) {
                char target = survey[i].charAt(0);
                map.put(target, map.get(target) + 4-number);
            } else if (number >= 5) {
                char target = survey[i].charAt(1);
                map.put(target, map.get(target) + number-4);
            } else {
                char target1 = survey[i].charAt(0);
                char target2 = survey[i].charAt(1);
                
                if (target1 < target2)
                    map.put(target1, map.get(target1));
                else
                    map.put(target2, map.get(target2));
            }
        }
        
        // System.out.println(map);
        StringBuilder sb = new StringBuilder();
        
        int n1 = map.getOrDefault('R', 0);
        int n2 = map.getOrDefault('T', 0);
        if (n1 > n2)
            sb.append('R');
        else if (n1 < n2)
            sb.append('T');
        else
            sb.append("R");
        
        int n3 = map.getOrDefault('C', 0);
        int n4 = map.getOrDefault('F', 0);
        if (n3 > n4)
            sb.append("C");
        else if (n3 < n4)
            sb.append("F");
        else
            sb.append("C");
        
        int n5 = map.getOrDefault('J', 0);
        int n6 = map.getOrDefault('M', 0);
        if (n5 > n6)
            sb.append("J");
        else if (n5 < n6)
            sb.append("M");
        else
            sb.append("J");
        
        int n7 = map.getOrDefault('A', 0);
        int n8 = map.getOrDefault('N', 0);
        if (n7 > n8)
            sb.append("A");
        else if (n7 < n8)
            sb.append("N");
        else
            sb.append("A");
        
        return sb.toString();
    }
}