import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            int sum = i;
            String str = String.valueOf(i);

            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - '0';
            }
            if (sum == N) {
                bw.write(String.valueOf(i));
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write(0 + "");
        bw.close();
    }
}