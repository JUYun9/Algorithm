import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double ratingSum = 0;
        double unitSum = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();
            double unit = Double.parseDouble(st.nextToken());
            String rating = st.nextToken();

            double ratingToInt = 0;
            if (rating.equals("A+"))
                ratingToInt = 4.5;
            else if (rating.equals("A0"))
                ratingToInt = 4.0;
            else if (rating.equals("B+"))
                ratingToInt = 3.5;
            else if (rating.equals("B0"))
                ratingToInt = 3.0;
            else if (rating.equals("C+"))
                ratingToInt = 2.5;
            else if (rating.equals("C0"))
                ratingToInt = 2.0;
            else if (rating.equals("D+"))
                ratingToInt = 1.5;
            else if (rating.equals("D0"))
                ratingToInt = 1.0;
            else
                ratingToInt = 0.0;


            if (rating.equals("P"))
                continue;
            else {
                ratingSum += ratingToInt * unit;
                unitSum += unit;
            }
        }
        bw.write(String.valueOf(ratingSum / unitSum));
        bw.flush();
        bw.close();
    }
}