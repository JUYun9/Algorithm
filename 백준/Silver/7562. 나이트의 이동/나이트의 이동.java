// 바킹독 BFS 문제집
// 2025-07-21 (월)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] dist;
    private static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[] curPos = new int[2];
        int[] targetPos = new int[2];

        while (testCase-- > 0) {
            int size = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            curPos[0] = Integer.parseInt(st.nextToken());
            curPos[1] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            targetPos[0] = Integer.parseInt(st.nextToken());
            targetPos[1] = Integer.parseInt(st.nextToken());

            if (curPos[0] == targetPos[0] && curPos[1] == targetPos[1]) {
                System.out.println(0);
                continue;
            }

            dist = new int[size][size];
            for (int[] row: dist)
                Arrays.fill(row, -1);

            bfs(curPos, targetPos, size);
        }
    }

    private static void bfs(int[] cur, int[] target, int boardSize) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{cur[0], cur[1]});
        dist[cur[0]][cur[1]] = 0;

        while (!queue.isEmpty()) {
            cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int dir = 0; dir < 8; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= boardSize || ny >= boardSize)
                    continue;
                if (dist[nx][ny] >= 0)
                    continue;

                queue.add(new int[]{nx, ny});
                dist[nx][ny] = dist[x][y] + 1;
                if (nx == target[0] && ny == target[1]) {
                    System.out.println(dist[nx][ny]);
                    return;
                }
            }
        }
    }
}
