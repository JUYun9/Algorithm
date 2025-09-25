import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] s = new int[num+1];

        for (int i = 1; i <= num; i++)
            s[i] = Integer.parseInt(br.readLine());

        if (num == 1) {
            System.out.println(s[1]);
            return;
        }

        dp = new int[num+1][3];

        // 초기값 계산
        dp[1][1] = s[1];
        dp[1][2] = 0;
        dp[2][1] = s[2];
        dp[2][2] = s[1] + s[2];


        for (int i = 3; i <= num; i++) {
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + s[i];
            dp[i][2] = dp[i-1][1] + s[i];
        }

        int ans = Math.max(dp[num][1], dp[num][2]);
        System.out.println(ans);
    }
}
