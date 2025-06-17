class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        
        int a = Math.max(wallet[0], wallet[1]);
        int b = Math.min(wallet[0], wallet[1]);
        
        int big = Math.max(bill[0], bill[1]);
        int small = Math.min(bill[0], bill[1]);
        while (true) {
            if (big < small) {
                int tmp = big;
                big = small;
                small = tmp;
            }
            
            // System.out.println(big);
            // System.out.println(small);
            
            if (big <= a && small <= b)
                return answer;
            
            big /= 2;
            answer++;
        }
    }
}

// 23분 ~
// bill에서 큰 값을 big, 작은 값을 small이라고 하자
// 반복문을 돌면서
    // if (wallet의 큰 값 > big && wallet의 작은 값 > small)
        // return answer
    // big /= 2, small /= 2
    // answer++;