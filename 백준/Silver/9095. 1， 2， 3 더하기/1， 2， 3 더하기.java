import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp = new int[10001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int num = Integer.parseInt(br.readLine());

            for (int i = 4; i <= num; i++) {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }

            System.out.println(dp[num]);
        }
    }
}
