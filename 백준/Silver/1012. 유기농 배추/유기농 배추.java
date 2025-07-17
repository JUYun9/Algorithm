// 바킹독 BFS 문제집
// 2024-07-17 (목)
// 16:30 ~
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int M, N;

    private static int[][] board;
    private static int[][] dist;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static Queue<int[]> queue;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        queue = new LinkedList<>();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); //가로
            N = Integer.parseInt(st.nextToken()); //세로
            int K = Integer.parseInt(st.nextToken()); //배추 위치의 개수

            dist = new int[M][N];
            for (int[] row: dist)
                Arrays.fill(row, -1);

            board = new int[M][N];
            // 배추가 심어진 곳: 1로 초기화
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            bfs(count);
        }
    }

    private static void bfs(int count) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0 || dist[i][j] == 0)
                    continue;

                dist[i][j] = 0;   //방문표시
                count++;
                queue.add(new int[]{i, j});
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= M || ny >= N)
                            continue;

                        if (dist[nx][ny] == 0 || board[nx][ny] == 0)
                            continue;

                        queue.add(new int[]{nx, ny});
                        dist[nx][ny] = 0;
                    }
                }

            }
        }

        System.out.println(count);
    }
}
