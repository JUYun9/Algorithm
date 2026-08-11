class Solution {
    static int[] sumArray;
    static int answer;
    public int solution(int[] numbers, int target){
        answer = 0;
        sumArray = new int[numbers.length];
        sumArray[numbers.length - 1] = numbers[numbers.length - 1];

        for(int i = numbers.length - 2; i >= 0; i--){ //가지치기 용 뒤에서부터 누적합
            sumArray[i] = sumArray[i + 1] + numbers[i];
        }
        dfs(0, numbers, 0, target);

        return answer;
    }

    public void dfs(int depth, int[] numbers, int val, int target){
        if(depth == numbers.length){
            if(val == target){
                answer++;
            }
            return;
        }

        // if(Math.abs(val - target) > sumArray[depth]){ //총 이동해야 하는 거리가 더 클 경우 가지치기
        //     return;
        // }

        dfs(depth + 1, numbers, val + numbers[depth], target);
        dfs(depth + 1, numbers, val - numbers[depth], target);
    }
}