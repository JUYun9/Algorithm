import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int A;
        int[] count = new int[11];
        for (int i = 0; i < 10; i++) {
            A = Integer.parseInt(br.readLine());
            count[i] = A % 42;
        }

        for (int j = 9; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (count[i] > count[i + 1]) {
                    int tmp = count[i];
                    count[i] = count[i + 1];
                    count[i + 1] = tmp;
                }
            }
        }

        int cnt = 1;
        for (int i = 0; i < 9; i++) {
            if (count[i] != count[i + 1])
                cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
