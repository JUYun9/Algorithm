import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = 10;

        int[] arr = new int[9];
        for (int i = 1; i <= testCase; i++) {
            int k = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 8; j++)
                arr[j] = Integer.parseInt(st.nextToken());

            int num = 1;
            while (arr[8] > 0) {
                int target = arr[1] - num;
                if (target < 0)
                    target = 0;
                for (int j = 2; j <= 8; j++) {
                    arr[j-1] = arr[j];
                }
                arr[8] = target;

                num++;
                if (num == 6)
                    num = 1;
            }

            // 출력
            System.out.print("#" + k + " ");
            for (int t = 1; t <= 8; t++)
                System.out.print(arr[t] + " ");
            System.out.println();

        }
    }
}