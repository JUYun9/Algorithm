import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 바킹독 BFS 문제집
// 2025-07-21 (월)
// 17:10 ~ 17:35

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static char[][] board;
    private static int[][] dist1; // 불
    private static int[][] dist2; // 상근
    private static int[] startPoint;

    private static Queue<int[]> queue1 = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            board = new char[height][width];
            dist1 = new int[height][width];
            dist2 = new int[height][width];

            // 거리 배열 -1로 초기화
            for (int[] row: dist1)
                Arrays.fill(row, -1);
            for (int[] row: dist2)
                Arrays.fill(row, -1);

            for (int i = 0; i < height; i++) {
                String line = br.readLine();
                for (int j = 0; j < width; j++) {
                    board[i][j] = line.charAt(j);
                    if (board[i][j] == '@') {
                        startPoint = new int[2];
                        startPoint[0] = i;
                        startPoint[1] = j;
                        dist2[i][j] = 0;
                    } else if (board[i][j] == '*') {
                        queue1.add(new int[]{i, j});
                        dist1[i][j] = 0;
                    }
                }
            }

            bfs1(width, height); // 불bfs
            bfs2(width, height, startPoint[0], startPoint[1]); // 상근 dfs
        }
    }

    private static void bfs1(int width, int height) {
        while (!queue1.isEmpty()) {
            int[] cur = queue1.poll();
            int x = cur[0];
            int y = cur[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= height || ny >= width)
                    continue;
                if (dist1[nx][ny] >= 0 || board[nx][ny] == '#')
                    continue;

                dist1[nx][ny] = dist1[x][y] + 1;
                queue1.add(new int[]{nx, ny});
            }
        }
    }

    private static void bfs2(int width, int height, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            x = cur[0];
            y = cur[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= height || ny >= width) {
                    System.out.println(dist2[x][y]+1);
                    return;
                }
                if (dist2[nx][ny] >= 0 || board[nx][ny] == '#' || board[nx][ny] == '*')
                    continue;
                if (dist1[nx][ny] != -1 && dist2[x][y]+1 >= dist1[nx][ny])
                    continue;

                dist2[nx][ny] = dist2[x][y] + 1;
                queue.add(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
