class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int start1 = 0;
        int start2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            if (start1 < cards1.length && target.equals(cards1[start1])) {
                start1++;
            } else if (start2 < cards2.length && target.equals(cards2[start2])) {
                start2++;
            } else
                return "No";

        }
        
        return "Yes";
    }
}