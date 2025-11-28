import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int totalMemberCnt = stages.length;
        
        // 인덱스: 라운드
        // 값: 해당 인덱스에서 실패한 멤버의 수
        int[] failCnt = new int[N+2];
        for (int i = 0; i < stages.length; i++) {
            int target = stages[i];
            failCnt[target]++;
        }
        
        List<StageInfo> failPercent = new ArrayList<>();
        for (int i = 1; i < failCnt.length-1; i++) {
            if (totalMemberCnt < failCnt[i])
                break;
            
            double target = (double) failCnt[i] / totalMemberCnt;
            totalMemberCnt -= failCnt[i];
            
            failPercent.add(new StageInfo(i, target));
        }
        
        Collections.sort(failPercent);
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failPercent.get(i).round;
        }
    
    
        return answer;
    }
}

// Comparable<..>
class StageInfo implements Comparable<StageInfo> {
    int round;
    double rate;
    
    StageInfo(int round, double rate) {
        this.round = round;
        this.rate = rate;
    }
    
    @Override
    public int compareTo(StageInfo o) {
        if (this.rate > o.rate)
            return -1;
        else if (this.rate < o.rate)
            return 1;
        
        return Integer.compare(this.round, o.round);
    }
}