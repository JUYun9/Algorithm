class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        StringBuilder id = new StringBuilder(new_id);
        // 1단계
        id = new StringBuilder(id.toString().toLowerCase());
        
        // 2단계
        id = new StringBuilder(id.toString().replaceAll("[^a-z0-9\\-_.]", ""));
        
        // 3단계
        id = new StringBuilder(id.toString().replaceAll("\\.{2,}", "."));
        
        // 4단계
        if (id.length() > 0 && id.charAt(0) == '.')
            id.deleteCharAt(0);
        if (id.length() > 0 && id.charAt(id.length() - 1) == '.')
            id.deleteCharAt(id.length() - 1);
        
        // 5단계
        if (id.length() == 0)
            id.append("a");
        
        // 6단계
        if (id.length() >= 16) {
            id.delete(15, id.length());
            if (id.charAt(id.length() - 1) == '.') {
                id.deleteCharAt(id.length() - 1);
            }
        }
        
        // 7단계
        while (id.length() < 3) {
            char lastChar = id.charAt(id.length() - 1);
                id.append(lastChar);
        }
        
        // id를 String으로 변환
        answer = id.toString();
        return answer;
    }
}