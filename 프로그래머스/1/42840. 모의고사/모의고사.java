import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] counts = new int[4];
        for (int i = 0; i < answers.length; i++) {
            int target = answers[i];
            if (target == arr1[i % arr1.length])
                counts[1]++;
            if (target == arr2[i % arr2.length])
                counts[2]++;
            if (target == arr3[i % arr3.length])
                counts[3]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        int max = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if (max <= counts[i])
                max = counts[i];
        }
        
        for (int i = 1; i < counts.length; i++) {
            if (max == counts[i])
                list.add(i);
        }
        
        int[] answer = new int[list.size()];
       
        int index = 0;
        for (int num: list) {
            answer[index++] = num;
        }
        
        
        return answer;
    }
}

// 40분~