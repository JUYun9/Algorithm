class Solution {
    
    private static int[] arr;
    
    public int solution(int n) {
        int answer = 0;
        
        arr = new int[100001];
        
        answer = fibonacci(n);
        
        return answer;
    }
    
    private int fibonacci(int num) {
        if (num <= 0)
            return 0;
        else if (num == 1) {
            arr[num] = 1;
            return arr[num];
        }
        else if (arr[num] > 0)
            return arr[num];
        else {
            arr[num] = (fibonacci(num-1) + fibonacci(num-2)) % 1234567;
            return arr[num];
        }
    }
    
    
}



// 27분 ~