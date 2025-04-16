class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        

        // 최대공약수
        for (int i = n; i >= 1; i--) {
            if (n%i == 0 && m%i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        // 최소공배수
        for (int i = 1; i <= n; i++) {
            int k = m*i;
            if (k%n == 0) {
                answer[1] = k;
                break;
            }
        }
            
        return answer;
    }
}

/*
m % n == 0일 경우 최대공약수는 n
0이 아닐 경우 n의 약수들을 구해서 작은 수부터 차례대로
t라고 하자. 이 때 m%t == 0이면 최대공약수는 t이다.

m의 약수들을 구하고 약수 중에서 작은 수부터 차례대로
n에 곱한 수를 k라고 하자.
이 때 k%m==0 && k%n==0이면 k는 최소공배수이다.
*/