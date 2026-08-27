import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']'); map.put('(', ')'); map.put('{', '}');
        
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                char target = list.remove(0);
                list.add(target);
            }
            
            for (int j = 0; j < list.size(); j++) {
                char target = list.get(j);
                
                if (j != 0) {
                    if (stack.isEmpty()) {
                        stack.add(target);
                        continue;
                    } else {
                        char peek = stack.peek();
                        if (map.get(peek) == null)
                            break;
                        else if (map.get(peek) == target) {
                            stack.pop();
                            continue;
                        }
                    }
                }
                
                stack.add(target);
            }

            if (stack.isEmpty())
                answer++;
            else
                stack.clear();
        }
        
        return answer;
    }
}