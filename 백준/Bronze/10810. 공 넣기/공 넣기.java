import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] box = new int[N+1];
        for (int i = 0; i < N; i++)
            box[i] = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer sy = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(sy.nextToken());
            int B = Integer.parseInt(sy.nextToken());
            int C = Integer.parseInt(sy.nextToken());
            for (int j = A; j <= B; j++) {
                box[j] = C;
            }
        }

        for (int i = 1; i <= N; i++)
            bw.write(String.valueOf(box[i]) + " ");

        bw.flush();
        bw.close();
    }
}
