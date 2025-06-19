class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] prevNum = new int[5];
        
        int arrIndex = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (arrIndex == 5)
                break;
            
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                int currentNum = c - '0';
                if (currentNum == 1 && dartResult.charAt(i+1) - '0' == 0) {
                    currentNum = 10;
                    i++;
                }
                
                prevNum[arrIndex++] = currentNum;
            } else if (c == 'D')
                prevNum[arrIndex-1] *= prevNum[arrIndex-1];
            else if (c == 'T') {
                prevNum[arrIndex-1] = prevNum[arrIndex-1]
                                    * prevNum[arrIndex-1] * prevNum[arrIndex-1];
            } else if (c == '*') {
                prevNum[arrIndex-1] *= 2;
                if (arrIndex-2 >= 0)
                    prevNum[arrIndex-2] *= 2;
            } else if (c == '#') {
                prevNum[arrIndex-1] *= -1;
            }
        }
        
        for (int i = 0; i < 3; i++)
            answer += prevNum[i];
        
        return answer;
    }
}

/*
int prevNum = 0;
int[] arr = new int[3];
for (dartResult의 각 인덱스 별로 확인)
    
    if (숫자)
        prevNum = 숫자;
    else if (S)
        prevNum *= 1; (그대로)
    else if (D)
        prevNum *= prevNum;
    else if (T)
        prevNum *= prevNum * prevNum;
    else if (*)
        arr[i-1] *= 2;
    else (#)
        arr[i-1] *= -2;
    
    arr[i] = prevNum;
}
*/