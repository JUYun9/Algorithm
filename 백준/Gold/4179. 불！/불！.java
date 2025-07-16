import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int R, C;
    private static char[][] maze;
    private static int[][] dist;
    private static int[][] fireTime;

    private static Queue<int[]> queue1;
    private static Queue<int[]> queue2;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];

        dist = new int[R][C];
        for (int[] row: dist)
            Arrays.fill(row, -1);

        fireTime = new int[R][C];
        for (int[] row: fireTime)
            Arrays.fill(row, -1);

        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                if (line.charAt(j) == 'J') {
                    queue1.add(new int[]{i, j});
                    dist[i][j] = 0;
                } else if (line.charAt(j) == 'F') {
                    queue2.add(new int[] {i, j});
                    fireTime[i][j] = 0;
                }

                maze[i][j] = line.charAt(j);
            }
        }

        bfsFire();
        bfsPerson();
    }

    private static void bfsFire() {
        while (!queue2.isEmpty()) {
            int[] cur = queue2.poll();
            int x = cur[0];
            int y = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C)
                    continue;
                if (fireTime[nx][ny] >= 0 || maze[nx][ny] == '#')
                    continue;

                fireTime[nx][ny] = fireTime[x][y] + 1;
                queue2.add(new int[] {nx,ny});
            }
        }
    }

    private static void bfsPerson() {
        int sx = queue1.peek()[0], sy = queue1.peek()[1];
        if (sx == 0 || sx == R-1 || sy == 0 || sy == C-1) {
            System.out.println(1);
            return;
        }

        while (!queue1.isEmpty()) {
            int[] cur = queue1.poll();
            int x = cur[0];
            int y = cur[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                    System.out.println(dist[x][y] + 1);
                    return;
                }
                if (dist[nx][ny] >= 0 || maze[nx][ny] != '.')
                    continue;
                if (fireTime[nx][ny] != -1 && dist[x][y]+1 >= fireTime[nx][ny])
                    continue;

                queue1.add(new int[] {nx, ny});

                dist[nx][ny] = dist[x][y] + 1;
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
