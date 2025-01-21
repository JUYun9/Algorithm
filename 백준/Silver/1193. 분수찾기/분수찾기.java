import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int remainder = 0;
        while (N > count) {
            N -= count;
            count++;
            if (N <= count) {
                remainder = N;
                break;
            }
        }

        int denominator = 0;
        int numerator = 0;
        if (count % 2 == 0) {
            denominator = count;   // 분모
            numerator = 1;   // 분자
            for (int i = 1; i < remainder; i++) {
                denominator--;
                numerator++;
            }
        } else {
            denominator = 1;
            numerator = count;
            for (int i = 1; i < remainder; i++) {
                denominator++;
                numerator--;
            }
        }

        bw.write(String.valueOf(numerator) + "/" + String.valueOf(denominator));
        bw.flush();
        bw.close();
    }
}