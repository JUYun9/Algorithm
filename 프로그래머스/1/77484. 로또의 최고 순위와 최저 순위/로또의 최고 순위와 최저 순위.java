class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int matchCount = 0, zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            int target = lottos[i];
            if (target == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (target == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }
        
        System.out.println(matchCount);
        System.out.println(zero);
            
        int maxCount = matchCount + zero;
        if (maxCount == 6)
            answer[0] = 1;
        else if (maxCount == 5)
            answer[0] = 2;
        else if (maxCount == 4)
            answer[0] = 3;
        else if (maxCount == 3)
            answer[0] = 4;
        else if (maxCount == 2)
            answer[0] = 5;
        else
            answer[0] = 6;
        
        if (matchCount == 6)
            answer[1] = 1;
        else if (matchCount == 5)
            answer[1] = 2;
        else if (matchCount == 4)
            answer[1] = 3;
        else if (matchCount == 3)
            answer[1] = 4;
        else if (matchCount == 2)
            answer[1] = 5;
        else
            answer[1] = 6;
             
        
        return answer;
    }
}