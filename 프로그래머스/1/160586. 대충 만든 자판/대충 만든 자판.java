class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                int minIndex = 100;
                boolean isValid = false;
                for (int k = 0; k < keymap.length; k++) {
                    for (int z = 0; z < keymap[k].length(); z++) {
                        char key = keymap[k].charAt(z);
                        if (target == key && z < minIndex) {
                            minIndex = z;
                            isValid = true;
                            break;
                        }
                    }
                }
                
                if (!isValid) {
                    answer[i] = -1;
                    break;
                }
                count += minIndex+1;
            }
            
            if (answer[i] != -1)
                answer[i] = count;
        }
        
        return answer;
    }
}