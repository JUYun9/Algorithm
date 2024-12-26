import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0)
                break;

            int squareA = A * A;
            int squareB = B * B;
            int squareC = C * C;

            if (squareA + squareB == squareC || squareA + squareC == squareB || squareB + squareC == squareA)
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }

        bw.flush();
        bw.close();

    }
}
