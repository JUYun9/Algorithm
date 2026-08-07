class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int[] arr = new int[10001];
        
        // int maxNum = -1;
        for (int i = 0; i < citations.length; i++) {
            int target = citations[i];
            // if (target > maxNum)
            //     maxNum = target;
            for (int j = 0; j <= target; j++)
                arr[j]++;
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (i < arr[i])
                answer = i;
            else if (arr[i] == i)
                return i;
            else
                return answer;
        }
        
        return answer;
    }
}