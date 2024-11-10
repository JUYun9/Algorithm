import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int cnt = 0;
        for (int i = 1; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A > max) {
                max = A;
                cnt = i;
            }
        }
        bw.write(max + "\n" + cnt);

        bw.flush();
        bw.close();
    }
}
