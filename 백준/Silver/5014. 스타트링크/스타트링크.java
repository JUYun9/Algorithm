// 바킹독 BFS 문제집
// 2024-07-22 (화)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx;
    private static int[] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalFloor = Integer.parseInt(st.nextToken());
        int myPos = Integer.parseInt(st.nextToken());
        int companyPos = Integer.parseInt(st.nextToken());
        int upperButton = Integer.parseInt(st.nextToken());
        int lowerButton = Integer.parseInt(st.nextToken());

        dx = new int[] {upperButton, -lowerButton};
        dist = new int[totalFloor+1]; // 0 ~ totalFloor
        Arrays.fill(dist, -1);

        if (myPos == companyPos) {
            System.out.println(0);
            return;
        }
        bfs(totalFloor, myPos, companyPos);
    }

    private static void bfs(int totalFloor, int myPos, int companyPos) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(myPos);
        dist[myPos] = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int dir = 0; dir < 2; dir++) {
                int nx = cur + dx[dir];

                if (nx <= 0 || nx > totalFloor || dist[nx] >= 0)
                    continue;

                dist[nx] = dist[cur] + 1;
                if (nx == companyPos) {
                    System.out.println(dist[nx]);
                    return;
                }
                queue.add(nx);
            }
        }

        System.out.println("use the stairs");
    }
}
