import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A + B - C;
        bw.write(result + "\n");

        int result2 = Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C;
        bw.write(String.valueOf(result2));

        bw.flush();
        bw.close();
    }
}
