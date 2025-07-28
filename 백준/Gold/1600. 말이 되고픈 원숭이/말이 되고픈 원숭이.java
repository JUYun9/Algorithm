import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] board;
    private static int[][][] dist;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int[] horseX = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] horseY = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int likeHorse = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        board = new int[row][col];
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dist = new int[row][col][likeHorse+1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                Arrays.fill(dist[i][j], -1);
        }

        if (row==1 && col==1) {
            System.out.println(0);
            return;
        }

        bfs(row, col, likeHorse);
    }

    private static void bfs(int row, int col, int likeHorse) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {0, 0, 0});
        dist[0][0][0] = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int used = cur[2];

            if (used < likeHorse) {
                for (int dir = 0; dir < 8; dir++) {
                    int nx = x + horseX[dir];
                    int ny = y + horseY[dir];

                    if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                        continue;
                    if (dist[nx][ny][used + 1] >= 0 || board[nx][ny] == 1)
                        continue;

                    queue.add(new int[]{nx, ny, used + 1});
                    dist[nx][ny][used + 1] = dist[x][y][used] + 1;
                }
            }

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                    continue;
                if (dist[nx][ny][used] >= 0 || board[nx][ny] == 1)
                    continue;

                queue.add(new int[]{nx, ny, used});
                dist[nx][ny][used] = dist[x][y][used] + 1;
            }
        }

        int ans = 100000;
        for (int i = 0; i <= likeHorse; i++) {
            if (dist[row-1][col-1][i] != -1)
                ans = Math.min(dist[row-1][col-1][i], ans);
        }

        if (ans == 100000)
            System.out.println(-1);
        else
            System.out.println(ans);

    }
}