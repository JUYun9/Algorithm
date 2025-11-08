import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for (int t = 1; t <= testCase; t++) {
            int size = Integer.parseInt(br.readLine());
            int[][] board = new int[size+1][size+1];

            // 입력
            for (int i = 1; i <= size; i++) {
                String str = br.readLine();
                for (int j = 1; j <= size; j++)
                    board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }

            int ans = 0;

            int range = 1;
            int targetIndex = (size+1)/2;
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j < range; j++) {
                    ans += board[i][targetIndex-j];
                }
                for (int j = 1; j < range; j++) {
                    ans += board[i][targetIndex+j];
                }
                ans += board[i][targetIndex];

                if (i >= targetIndex)
                    range--;
                else
                    range++;
            }

            System.out.println("#" + t + " " + ans);
        }
    }
}