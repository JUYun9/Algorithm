class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int lux = 100, luy = 100;   // 시작점
        int rdx = 0, rdy = 0;   // 끝점
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char ch = wallpaper[i].charAt(j);
                if (ch == '.')
                    continue;
                
                if (i < lux)
                    lux = i;
                
                if (j < luy)
                    luy = j;
                
                if (i > rdx)
                    rdx = i;
                
                if (j > rdy)
                    rdy = j;
            }   
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        
        return answer;
    }
}