import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int count = 0;

        int tmp = length - up;
        count++;
        if (tmp % (up-down) == 0)
            count += tmp / (up-down);
        else
            count += tmp / (up-down) + 1;


        bw.write(String.valueOf(count));
        bw.close();
    }
}