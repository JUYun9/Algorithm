import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 1. 유저별 인덱스 저장 (최종 결과 배열 answer에 접근하기 위해)
        Map<String, Integer> userIdx = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            userIdx.put(id_list[i], i);
        }
        
        // 2. 신고 기록 저장 (Key: 신고당한 사람, Value: 신고한 사람들의 집합)
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }
        
        // 3. 신고 내역 처리
        for (String r : report) {
            String[] str = r.split(" ");
            String reporter = str[0];  // 신고한 사람
            String reported = str[1];  // 신고당한 사람
            
            // HashSet이므로 같은 사람이 여러 번 신고해도 알아서 중복이 걸러집니다.
            reportMap.get(reported).add(reporter);
        }
        
        // 4. 정지 결과 통보 메일 횟수 계산
        for (String reported : id_list) {
            HashSet<String> reporters = reportMap.get(reported); // 나를 신고한 사람들
            
            // 신고당한 횟수가 k 이상이면
            if (reporters.size() >= k) {
                // 나를 신고한 사람들에게 각각 메일 발송 (+1)
                for (String reporter : reporters) {
                    int idx = userIdx.get(reporter); // 신고한 사람의 인덱스를 찾아서
                    answer[idx]++;
                }
            }
        }
        
        return answer;
    }
}