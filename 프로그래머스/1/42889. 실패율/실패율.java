import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] failCount = new int[N+2];
        
        int totalMemberCount = stages.length;
        for (int i = 0; i < stages.length; i++) {
            int target = stages[i];
            failCount[target]++;   // (target-1) 라운드의 실패한 사용자의 수가 담긴다.
        }
        
        List<StageInfo> failPercent = new ArrayList<>();
        for (int i = 1; i < failCount.length-1; i++) {
            double rating = 0.0;
            
            if (totalMemberCount > 0) {
                rating = (double) failCount[i] / totalMemberCount;
                totalMemberCount -= failCount[i];
            }
            
            failPercent.add(new StageInfo(i, rating));
        }
        
        Collections.sort(failPercent);
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++)
            answer[i] = failPercent.get(i).stageNum;
        
        return answer;
    }
}

class StageInfo implements Comparable<StageInfo> {
    int stageNum;
    double rate;

    public StageInfo(int stageNum, double rate) {
        this.stageNum = stageNum;
        this.rate = rate;
    }

    @Override
    public int compareTo(StageInfo other) {
        if (this.rate < other.rate)
            return 1;
        if (this.rate > other.rate)
            return -1;
        
        return Integer.compare(this.stageNum, other.stageNum);
    }
}

// 스테이지 배열에 적혀있는 숫자 = 해당 라운드를 통과하지 못했다.
// 스테이지 배열에서 가장 큰 숫자 크기만큼의 배열(a)을 선언한다.
// a[]에는 각 스테이지 실패율 값과 인덱스 번호를 넣는다.
// a[]를 내림차순으로 정렬한 값을 출력한다.