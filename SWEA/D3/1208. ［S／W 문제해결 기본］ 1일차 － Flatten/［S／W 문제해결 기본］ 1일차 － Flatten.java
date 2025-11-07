import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[101];
        for (int i = 1; i <= 10; i++) {
            int ans = 0;

            int dump = Integer.parseInt(br.readLine());

            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 100; j++)
                arr[j] = Integer.parseInt(st.nextToken());


            while (dump-- > 0) {
                Arrays.sort(arr);
                if (arr[100] - arr[1] <= 1)
                    break;

                arr[1] += 1;
                arr[100] -= 1;
            }

            Arrays.sort(arr);
            ans = arr[100] - arr[1];

            System.out.println("#" + i + " " + ans);
        }
    }
}

// 40분 ~
