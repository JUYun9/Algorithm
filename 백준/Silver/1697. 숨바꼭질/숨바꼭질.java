import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static int[] dist = new int[100_001]; // 0 ~ 100000

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Arrays.fill(dist, -1);  // 모든 위치를 미방문으로 초기화
        dist[n] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(n);

        while (dist[k] == -1) {
            int cur = q.poll();

            for (int next : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (next < 0 || next > 100000) continue;
                if (dist[next] != -1) continue;

                dist[next] = dist[cur] + 1;
                q.offer(next);
            }
        }

        System.out.println(dist[k]);
    }
}
