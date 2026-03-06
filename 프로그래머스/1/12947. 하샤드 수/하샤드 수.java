class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int y = x;
        while (y > 0) {
            sum += y%10;
            y /= 10;
        }
        
        answer = (x%sum == 0) ? true : false;
        
        return answer;
    }
}