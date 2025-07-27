import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] board;
    private static boolean[][] visited;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        findIslandNumber(N);
    }

    private static void findIslandNumber(int size) {
        int index = 1;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0 || visited[i][j])
                    continue;
                queue.add(new int[]{i, j});
                visited[i][j] = true;
                board[i][j] = index;
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if (nx < 0 || ny < 0 || nx >= size || ny >= size)
                            continue;
                        if (board[nx][ny] == 0 || visited[nx][ny])
                            continue;

                        queue.add(new int[]{nx, ny});
                        board[nx][ny] = index;
                        visited[nx][ny] = true;
                    }
                }
                index++;
            }
        }
        for (int i = 0; i < visited.length; i++)
            Arrays.fill(visited[i], false);

        /*
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
         */

        bfs(size);
    }

    private static void bfs(int size) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] dist = new int[size][size];

        int minDistance = 100000;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0 || visited[i][j])
                    continue;

                int startIsland = board[i][j];

                visited = new boolean[size][size];
                queue.add(new int[]{i, j});
                dist[i][j] = 0;
                visited[i][j] = true;

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if (nx < 0 || ny < 0 || nx >= size || ny >= size)
                            continue;
                        if (board[nx][ny] != 0 && startIsland != board[nx][ny])
                            minDistance = Math.min(minDistance, dist[x][y]);

                        if (!visited[nx][ny] && board[nx][ny] == 0) {
                            dist[nx][ny] = dist[x][y] + 1;
                            queue.add(new int[]{nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
        }

        System.out.println(minDistance);
    }
}
