import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int resultA = 0; int resultB = 0;
            int P = Integer.parseInt(st.nextToken());   // A사 L당 요금
            int Q = Integer.parseInt(st.nextToken());   // B사 R리터 이하 요금
            int R = Integer.parseInt(st.nextToken());   // B사 사용한 수도 R리터
            int S = Integer.parseInt(st.nextToken());   // B사 L당 요금
            int W = Integer.parseInt(st.nextToken());   // 사용한 수도의 양

            resultA += P*W;

            if (W < R)
                resultB = Q;
            else
                resultB += Q + (W-R)*S;
            
            
            int result = Math.min(resultA, resultB);
            
            System.out.println("#" + i + " " + result);
        }
    }
}