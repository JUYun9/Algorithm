import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        double[] score = new double[count];

        double maxScore = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            if (score[i] > maxScore)
                maxScore = score[i];
        }

        double avg = 0;
        for (int i = 0; i < count; i++) {
            score[i] = score[i] / maxScore * 100;
            avg += score[i];
        }

        bw.write(Double.toString(avg/count));
        bw.flush();
        bw.close();

    }
}
