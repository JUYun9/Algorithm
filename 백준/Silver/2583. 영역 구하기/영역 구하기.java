// 바킹독 BFS 문제집
// 2025-07-22 (화)
// 50분 ~
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int M, N;

    private static int[][] dist;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dist = new int[N][M];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    dist[j][k] = -1;
                }
            }
        }

        bfs();
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dist[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    dist[i][j] = 1;

                    count++;

                    int area = 1;
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];
                        for (int dir = 0; dir < 4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];

                            if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                                continue;
                            if (dist[nx][ny] != 0)
                                continue;

                            queue.add(new int[]{nx, ny});
                            dist[nx][ny] = dist[x][y] + 1;

                            area++;
                        }
                    }

                    priorityQueue.add(area);
                    area = 0;
                }
            }
        }

        System.out.println(count);
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
