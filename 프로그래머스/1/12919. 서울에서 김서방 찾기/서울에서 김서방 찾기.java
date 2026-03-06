class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        for (int i = 0; i < seoul.length; i++) {
            String target = "Kim";
            if (seoul[i].equals(target))
                sb.append(i).append("에 있다");
        }
        
        answer = sb.toString();
        
        return answer;
    }
}