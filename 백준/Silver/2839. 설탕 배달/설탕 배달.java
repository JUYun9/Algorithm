import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int numOfFiveKg = N / 5;
        while (true) {
            int count = numOfFiveKg;
            int weight = N - numOfFiveKg*5;
            if (weight % 3 == 0) {
                count += weight/3;
                bw.write(String.valueOf(count));
                break;
            }
            numOfFiveKg--;
            if (numOfFiveKg == -1) {
                bw.write(String.valueOf(numOfFiveKg));
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}