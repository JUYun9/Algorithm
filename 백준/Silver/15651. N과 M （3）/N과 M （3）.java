import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int n, m;
    private static int[] arr;

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        backTracking(0);

        System.out.println(sb);
    }

    private static void backTracking(int count) {
        if (count == m) {
            for (int i = 0; i < m; i++)
                sb.append(arr[i]).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[count] = i;
            backTracking(count+1);
        }
    }
}
