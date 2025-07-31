import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int n, m;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n+1];

        backTracking(0);
    }

    private static void backTracking(int count) {
        if (count == m) {
            for (int i = 0; i < m; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (count > 0 && arr[count-1] > i)
                    continue;
                arr[count] = i;
                visited[i] = true;
                backTracking(count + 1);
                visited[i] = false;
            }
        }
    }
}
