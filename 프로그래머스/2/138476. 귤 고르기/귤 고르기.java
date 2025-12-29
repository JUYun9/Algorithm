import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] count = new int[10000001];
        for (int i = 0; i < tangerine.length; i++)
            count[tangerine[i]]++;
        
        Arrays.sort(count);
        for (int i = count.length-1; i > 0; i--) {
            int target = count[i];
            if (target == 0)
                break;
            
            if (k <= target)
                return answer+1;
            
            k -= target;
            answer++;
        }
        
        return answer;
    }
}

// 15:15 ~

/*
tangerine: 귤의 크기가 담긴 배열

1. tangerine과 사이즈가 같은 배열(count)을 하나 선언하고
(사이즈가 하나 더 큰 배열은 선언하는게 헷갈리지 않고 좋을듯)
2. tangerine 배열을 순회하면서 해당 인덱스의 숫자 그러니까
count[tangerine[i]]++ 를 한다.
3. count 배열을 정렬한다.
4. count 배열을 맨 뒤의 인덱스부터 확인하면서 k의 값과 비교한다.
    - k가 더 크다면 k에서 해당 count 값을 빼고 answer++
    - k가 더 작다면 answer+1 값을 리턴한다.

*/