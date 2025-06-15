import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {2,1,2,3,2,4,2,5};
        int[] arr3 = new int[] {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0, count2 = 0, count3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length])
                count1++;
            if (answers[i] == arr2[i % arr2.length])
                count2++;
            if (answers[i] == arr3[i % arr3.length])
                count3++;
        }
        
        List<Integer> list = new LinkedList<>();
        int maxValue = Math.max(count1, Math.max(count2, count3));
        
        if (count1 == maxValue)
            list.add(1);
        if (count2 == maxValue)
            list.add(2);
        if (count3 == maxValue)
            list.add(3);
        
        int index = 0;
        int[] answer = new int[list.size()];
        for (int s: list) {
            answer[index++] = s;
        }
        
        return answer;
    }
}

/*
1번: 1234512345
2번: 2123242521
3번: 3311224455
*/

// 설계
/*
1. 삼인방의 찍는 방식을 배열에 넣는다.
2. answers 각 요소들을 순회한다.
    3. 삼인방의 번호와 answers[i]가 같은지 비교한다.
    4. 같다면 그 사람에 해당하는 count 값을 증가시킨다.
5. if (count 값이 다 다르다면)
    6. 세 사람 중에 가장 큰 count 값을 가진 사람을 리턴한다.
7. else if (같은 카운트 값이 있다면)
    8. 두 사람을 오름차순으로 리턴한다.
*/