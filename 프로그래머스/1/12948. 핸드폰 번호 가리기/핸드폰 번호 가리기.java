class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        
        int length = phone_number.length() - 4;
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < length)
                answer.append('*');
            else answer.append(phone_number.charAt(i));
        }
        
        return answer.toString();
    }
}