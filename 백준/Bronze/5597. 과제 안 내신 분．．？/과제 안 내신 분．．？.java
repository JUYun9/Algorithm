import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A;
        int[] arr = new int[31];
        for (int i = 1; i < 29; i++) {
            A = Integer.parseInt(br.readLine());
            arr[A] = 1;
        }

        for (int i = 1; i < 31; i++) {
            if (arr[i] != 1)
                bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
