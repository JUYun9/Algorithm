import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        // 각 번호에 맞는 공을 넣음
        for (int i = 1; i <= N; i++)
            arr[i] = i;

        for (int i = 1; i <= M; i++) {
            StringTokenizer sk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(sk.nextToken());
            int t = Integer.parseInt(sk.nextToken());
            int tmp1 = arr[s];
            int tmp2 = arr[t];
            arr[s] = tmp2;
            arr[t] = tmp1;
        }

        for (int i = 1; i <= N; i++)
            bw.write(String.valueOf(arr[i]) + " ");

        bw.flush();
        bw.close();
    }
}
