import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] sum = new int[n+1];
        sum[0] = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            sum[i] = Integer.parseInt(st.nextToken()) + sum[i-1];

        while (count-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int result = sum[end] - sum[start-1];

            System.out.println(result);
        }
    }
}
