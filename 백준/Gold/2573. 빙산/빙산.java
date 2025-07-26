import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] board;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static int time;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        board = new int[row][col];
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(row, col);
    }

    private static void bfs(int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] melt = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 0)
                    continue;
                queue.add(new int[]{i, j});
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                            continue;
                        if (board[nx][ny] == 0) {
                            melt[x][y]++;
                            if (melt[x][y] == board[x][y])
                                break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                board[i][j] -= melt[i][j];
        }

        time++;
        division(row, col);
    }

    private static void division(int row, int col) {
        int count = 0;

        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();

        int zeroCount = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != 0 && !visited[i][j]) {
                    queue.add(new int[]{i, j});
                    count++;
                    if (count >= 2) {
                        System.out.println(time);
                        return;
                    }

                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];
                        for (int dir = 0; dir < 4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];

                            if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                                continue;
                            if (board[nx][ny] == 0 || visited[nx][ny])
                                continue;

                            queue.add(new int[]{nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                } else if (board[i][j] == 0) {
                    zeroCount++;
                    if (zeroCount == row*col) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }

        bfs(row, col);
    }
}
