import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = 10;
        for (int i = 1; i <= testCase; i++) {
            int line = Integer.parseInt(br.readLine());
            int[][] arr = new int[line+1][line+1];

            // 입력
            for (int j = 1; j <= line; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= line; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0;
            for (int j = 1; j <= line; j++) {
                int prev = 0;
                for (int k = 1; k <= line; k++) {
                    if (arr[k][j] == 1)
                        prev = 1;
                    else if (arr[k][j] == 2) {
                        if (prev == 1) {
                            prev = 0;
                            ans++;
                        }
                    }
                }
            }

            System.out.println("#" + i + " " + ans);
        }

    }
}
