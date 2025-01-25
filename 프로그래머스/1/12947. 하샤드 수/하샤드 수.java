class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            sum += str.charAt(i) - '0';
        
        if (x % sum == 0)
            return answer;
        else
            return !answer;
    
    }
}