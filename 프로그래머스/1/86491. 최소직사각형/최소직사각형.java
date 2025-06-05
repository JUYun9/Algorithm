class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int big = 0;   // 가로
        int small = 0;  // 세로
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                if (sizes[i][1] > big)
                    big = sizes[i][1];
                if (sizes[i][0] > small)
                    small = sizes[i][0];
            } else {
                if (sizes[i][0] > big)
                    big = sizes[i][0];
                if (sizes[i][1] > small)
                    small = sizes[i][1];
            }
        }
        
        return big*small;
    }
}

// 첫 번째 명함을 기준으로 잡는다.
// 두 번째 명함부터 기준 명함과 가로 길이, 세로 길이를 비교한다.
// IF (기준 명함 가로 < 현재 명함 가로 && 기준 명함 세로 < 현재 명함 세로)
    // 기준 명함 가로 = 현재 명함 가로, 기준 명함 세로 = 현재 명함 세로
// ELSE {
    // 여기서 가로, 세로를 바꿔도 위 IF문을 만족하지 않으면 아래를 실행 
    //ELSE IF (기준 명함 가로 < 현재 명함 가로 && 기준 명함 세로 > 현재 명함 세로)
    // 기준 명함 가로 = 현재 명함 가로
// ELSE IF (기준 명함 가로 > 현재 명함 가로 && 기준 명함 세로 < 현재 명함 세로)
    // 기준 명함 세로 = 현재 명함 세로
// }