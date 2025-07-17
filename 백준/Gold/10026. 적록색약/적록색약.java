import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 바킹독 BFS 문제집
// 2025-07-17 (목)
// 20분 +
public class Main {

    private static int N;
    private static int normalCount;
    private static int blindCount;

    private static char[][] board;
    private static int[][] dist;
    private static int[][] dist2;
    private static Queue<int[]> queue;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        dist = new int[N][N];
        for (int[] row: dist)
            Arrays.fill(row, -1);

        dist2 = new int[N][N];
        for (int[] row: dist2)
            Arrays.fill(row, -1);

        queue = new LinkedList<>();

        normalBfs();
        colorBlindBfs();
    }

    private static void normalBfs() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dist[i][j] == -1) {
                    queue.add(new int[]{i, j});
                    dist[i][j] = 0;
                    normalCount++;
                }

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                            continue;
                        if (dist[nx][ny] != -1 || board[nx][ny] != board[x][y])
                            continue;

                        queue.add(new int[]{nx, ny});
                        dist[nx][ny] = 0;
                    }
                }
            }
        }

        System.out.print(normalCount);
    }

    private static void colorBlindBfs() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R')
                    board[i][j] = 'G';
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dist2[i][j] == -1) {
                    queue.add(new int[]{i, j});
                    dist2[i][j] = 0;
                    blindCount++;
                }

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                            continue;
                        if (dist2[nx][ny] != -1 || board[nx][ny] != board[x][y])
                            continue;

                        queue.add(new int[]{nx, ny});
                        dist2[nx][ny] = 0;
                    }
                }
            }
        }

        System.out.print(" " + blindCount);
    }
}
