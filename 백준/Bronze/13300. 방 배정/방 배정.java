import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[7][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            arr[Y][S]++;
        }

        int result = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                result += arr[i][j] / K;
                if (arr[i][j] % K != 0)
                    result++;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}