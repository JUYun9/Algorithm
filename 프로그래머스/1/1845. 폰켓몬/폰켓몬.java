import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-1; i++) {
            if (answer == nums.length/2)
                break;
            
            if (nums[i] != nums[i+1])
                answer++;
        }
        
        
        return answer;
    }
}

// 15:00 ~
// 같은 종류 -> 같은 번호
// 최대한 다양한 종류의 폰켓몬을 가지길 원함
// N마리 중 N/2마리를 선택한다.