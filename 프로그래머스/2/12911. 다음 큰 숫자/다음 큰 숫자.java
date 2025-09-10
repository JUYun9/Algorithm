class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        // Integer.binaryToString
        String binaryNum = Integer.toBinaryString(n);
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1')
                count++;
        }
        
        int target = n + 1;
        while (true) {
            String targetToBinary = Integer.toBinaryString(target);
            String replaced = targetToBinary.replace("0", "");
            if (replaced.length() == count) {
                answer = Integer.parseInt(targetToBinary, 2);
                break;
            }
            
            target ++;
        }
        
        return answer;
    }
}