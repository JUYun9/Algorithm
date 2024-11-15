import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] boxNumber = new int[N+1];
        for (int i = 1; i <= N; i++)
            boxNumber[i] = i;

        for (int i = 0; i < M; i++) {
            StringTokenizer sk = new StringTokenizer(br.readLine());
            int reversedStart = Integer.parseInt(sk.nextToken());
            int reversedEnd = Integer.parseInt(sk.nextToken());

            while (reversedStart < reversedEnd) {
                int tmp = boxNumber[reversedStart];
                boxNumber[reversedStart++] = boxNumber[reversedEnd];
                boxNumber[reversedEnd--] = tmp;
            }
        }

        for (int i = 1; i <= N; i++)
            bw.write(boxNumber[i] + " ");

        bw.flush();
        bw.close();

    }
}
