import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (A < min)
                min = A;

            if (A > max)
                max = A;
        }

        bw.write(min + " " + max);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
