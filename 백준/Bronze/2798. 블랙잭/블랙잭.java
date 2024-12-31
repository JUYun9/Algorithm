import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cardNum = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            cardNum[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int tmp = cardNum[i] + cardNum[j] + cardNum[k];

                    if (tmp == M)
                        sum = tmp;
                    else if (tmp > sum && tmp < M)
                        sum = tmp;
                }
            }
        }
        bw.write(sum + "");
        bw.close();
    }
}