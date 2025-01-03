import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int T = N - K;

        int result = 1;
        while (N >= 1) {
            result *= N;
            N--;
        }

        while (K >= 1) {
            result /= K;
            K--;
        }

        while (T >= 1) {
            result /= T;
            T--;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}