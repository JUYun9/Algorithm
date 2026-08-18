import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] vis = new boolean[words.length];
        
        Queue<Words> queue = new ArrayDeque<>();
        for (int i = 0; i < words.length; i++) {
            String tar = words[i];
            if (sameTwoWords(begin, tar))
                queue.offer(new Words(tar, i, 1));
        }
        
        if (queue.isEmpty())
            return answer;
        
        while (!queue.isEmpty()) {
            Words cur = queue.poll();
            
            begin = cur.word;
            int idx = cur.index;
            int cnt = cur.count;     
        
            if (begin.equals(target))
                return cnt;

            for (int i = 0; i < words.length; i++) {
                String tar = words[i];
                if (!vis[i]) {
                    if (sameTwoWords(begin, tar)) {
                        vis[i] = true;
                        queue.offer(new Words(tar, i, cnt+1));
                        answer = cnt+1;
                    }
                }
            }
        }
        
        return begin.equals(target) ? answer : 0;
    }
    
    private boolean sameTwoWords(String str1, String str2) {
        int cnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                cnt++;
        }
        
        if (cnt == 1)
            return true;
        
        return false;
    }
}

class Words {
    String word;
    int index;
    int count;
    
    Words(String word, int index, int count) {
        this.word = word;
        this.index = index;
        this.count = count;
    }
}

// 14:40