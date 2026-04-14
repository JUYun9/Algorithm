import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int j = 1;
            while (st.hasMoreTokens()) {
                arr[i][j++] = Integer.parseInt(st.nextToken());
//                System.out.print(arr[i][j-1] + " ");
            }
//            System.out.println();
        }

        int[][] dp = new int[n+1][n+1];
        dp[1][1] = arr[1][1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int target = arr[i][j];
//                if (target == 0)
//                    break;

                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (max < dp[n][i])
                max = dp[n][i];
        }

        System.out.println(max);
    }
}
