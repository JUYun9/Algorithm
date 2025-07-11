import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
    
        for (int move: moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move-1] != 0) {
                    if (stack.isEmpty())
                        stack.push(board[i][move-1]);
                    else {
                        if (stack.peek() == board[i][move-1]) {
                            stack.pop();
                            answer += 2;
                        } else
                            stack.push(board[i][move-1]);
                    }
                    
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
 
        
        return answer;
    }
}

/*
- `moves` 배열의 인덱스를 순회하면서
- `board[i][해당 인덱스 - 1]` 값을 확인한다.
    - 만약 0이라면 `i++`
    - 0이 아니라면 해당 값을 0으로 바꾸고 스택에 넣는 것을 반복한다.
- 스택의 가장 위에 있는 값과 같다면 가장 위에 있는 값을 제거한다.
- 그렇지 않다면 스택에 추가한다.
*/