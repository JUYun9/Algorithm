// 바킹독 BFS 문제집
// 2025-07-15 (화)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int N, M;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int[][] box;
    private static int[][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }   // 입력 완료

        dist = new int[N][M];
        for (int[] row: dist)
            Arrays.fill(row, -1);

        bfs();
    }

    private static void bfs() {
        // 이미 토마토가 다 익어있는 경우
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1 || box[i][j] == -1) {
                    count++;
                }
            }
        }
        if (count == N*M) {
            System.out.println(0);
            return;
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    dist[i][j] = 0;
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;
                if (dist[nx][ny] != -1 || box[nx][ny] != 0) //
                    continue;

                queue.add(new int[] {nx, ny});
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
            }
        }

        int maxDistance = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dist[i][j] > maxDistance)
                    maxDistance = dist[i][j];
                // 토마토가 있는 곳인데 탐색하지 못한 곳이 있는 경우
                if (box[i][j] != -1 && dist[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(maxDistance);
    }
}

// [1, 0, -1] : [익음, 안익음, 비어있음]
