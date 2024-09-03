class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        int index = 0;
        for (int i = 0; i < ingredient.length; i++) {
            ingredient[index] = ingredient[i];
            if (index >= 3 && ingredient[index] == 1 && ingredient[index - 1] == 3 
                && ingredient[index - 2] == 2 && ingredient[index - 3] == 1) {
                answer++;
                index -= 4;
            }
            index++;
        }

        return answer;
    }
}