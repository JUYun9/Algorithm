class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long totalPrice = 0;
        while (count > 0) {
            totalPrice += price * count;
            count--;
        }
        
        if (totalPrice > money)
            answer = totalPrice - money;
        

        return answer;
    }
}

// 12 9 6 3