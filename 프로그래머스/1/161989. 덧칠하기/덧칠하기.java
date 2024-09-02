class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int lastPainted = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > lastPainted) {
                answer++;
                lastPainted = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}