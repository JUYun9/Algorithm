import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int input = Integer.parseInt(br.readLine());
            int[][] arr = new int[101][101];

            // 입력
            for (int j = 1; j <= 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int k = 1; k <= 100; k++)
                    arr[j][k] = Integer.parseInt(st.nextToken());

            }

            int maxX = 0, maxY = 0;
            for (int x = 1; x <= 100; x++) {
                int sumX = 0, sumY = 0;
                for (int y = 1; y <= 100; y++) {
                    sumX += arr[x][y];
                    sumY += arr[y][x];
                }
                if (sumX > maxX)
                    maxX = sumX;
                if (sumY > maxY)
                    maxY = sumY;

            }

            int maxZ = 0;
            int sumZ1 = 0, sumZ2 = 0;
            for (int k = 1; k <= 100; k++)
                sumZ1 += arr[k][k];
            for (int k = 1; k <= 100; k++)
                sumZ2 += arr[101-k][k];

            maxZ = Math.max(sumZ1, sumZ2);

            int max = 0;
            max = Math.max(maxX, Math.max(maxY, maxZ));

            System.out.println("#" + input + " " + max);

            if (input == 10)
                break;
        }


    }
}
