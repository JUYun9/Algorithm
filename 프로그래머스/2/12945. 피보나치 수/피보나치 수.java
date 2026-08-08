class Solution {
    public int solution(int n) {     
        int[] arr = new int[n+1];
        
        arr[2] = 1; arr[3] = 2;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
            if (arr[i] > 1234567)
                arr[i] %= 1234567;
        }
        
        return arr[n];
    }
}