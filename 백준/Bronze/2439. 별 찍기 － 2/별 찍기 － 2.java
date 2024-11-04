import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= T - i; j++)
                bw.write(" ");
            for (int k = 1; k <= i; k++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
