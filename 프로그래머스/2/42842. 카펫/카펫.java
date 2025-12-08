class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        int row = 1;
        while (true) {
            int col = sum/row;
            int remainder = sum%row;
            if (remainder==0 && row >= col) {       
                if ((row-2)*(col-2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
            
            row++;
        }
        
        
        return answer;
    }
}

// 21:40 ~