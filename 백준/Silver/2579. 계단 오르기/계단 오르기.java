import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] score = new int[num+1];

        for (int i = 1; i <= num; i++)
            score[i] = Integer.parseInt(br.readLine());

        if (num == 1) {
            System.out.println(score[1]);
            return;
        }
        if (num == 2) {
            System.out.println(score[1] + score[2]);
            return;
        }

        int[] dp = new int[num+1];
        dp[1] = score[1]; dp[2] = score[1] +score[2];
        for (int i = 3; i <= num; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + score[i-1]) + score[i];
//            System.out.println(dp[i]);
        }

        System.out.println(dp[num]);
    }
}
