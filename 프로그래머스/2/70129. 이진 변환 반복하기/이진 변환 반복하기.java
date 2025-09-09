class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int loop = 0;
        int zeroSum = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            int zeroCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    zeroCount++;
            }
            
            zeroSum += zeroCount;
            
            int size = s.length() - zeroCount;
            while (size != 0) {
                sb.append(size % 2);
                size /= 2;
            }
            
            s = sb.toString();
            loop++;
            
            if (s.equals("1"))
                break;
        }
        
        answer[0] = loop;
        answer[1] = zeroSum;
        
        return answer;
    }
}