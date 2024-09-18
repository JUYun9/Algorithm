import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            // 점이랑 공백을 기준으로 쪼갬
            String[] splitPrivacies = privacies[i].split(" ");
            String[] date = splitPrivacies[0].split("\\.");
            
            String termType = splitPrivacies[1];
            
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            
            int termDuration = 0;
            for (String term : terms) {
                String[] splitTerm = term.split(" ");
                if (splitTerm[0].equals(termType)) {
                    termDuration = Integer.parseInt(splitTerm[1]);
                    break;
                }
            }
            
            month += termDuration;
            
            while (month > 12) {
                year++;
                month -= 12;
            }
            
            
            // today랑 날짜 비교
            String[] splitToday = today.split("\\.");
            int todayYear = Integer.parseInt(splitToday[0]);
            int todayMonth = Integer.parseInt(splitToday[1]);
            int todayDay = Integer.parseInt(splitToday[2]);
            if ((todayYear > year)
                || (todayYear == year && todayMonth > month)
                || (todayYear == year && todayMonth == month &&
                todayDay >= day)) {
                list.add(i+1);
            }
        } 
        return list;
    }
}

// privacies[i]의 마지막 원소가 A인지 B인지 또는 C 인지를 확인한다.
// 각각 A,B,C일 때 달에 해당하는 원소에 +6, +12, +3을 한다.
// 만약 달에 해당하는 원소가 12를 초과하면 해당 년도 +1을 하고 해당 달에 - 12를 해준다.
// 그리고 today 이후 날짜일 경우 번호를 result에 추가해준다.