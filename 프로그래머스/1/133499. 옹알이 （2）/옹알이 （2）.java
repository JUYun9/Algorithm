class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("ayaaya") ||
               babbling[i].contains("yeye") ||
               babbling[i].contains("woowoo") ||
               babbling[i].contains("mama"))
                continue;
            
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            
            babbling[i] = babbling[i].replace(" ", "");
            
            if (babbling[i].length() == 0)
                answer++;
        }
        
        return answer;
    }
}

// ayaye의 경우 aya + ye의 조합으로 만들 수 있는데
// "ayaye"에서 "aya"를 카운트했으면 "aya"를 빼고 "ye"만 남겨서 카운트해야하는데
// 이 부분을 어떻게 구현해야할지 모르겠다.