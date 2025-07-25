import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx ={0, 1, 0, -1};
    private static int[] dy ={1, 0, -1, 0};

    private static char[][] board;
    private static int[][][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        board = new char[row][col];
        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        dist = new int[row][col][2];

        bfs(row, col);
    }

    private static void bfs(int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});
        dist[0][0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int broken = cur[2];

            if (x == row-1 && y == col-1) {
                System.out.println(dist[x][y][broken]);
                return;
            }
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= row || ny >= col || broken > 1)
                    continue;
                if (board[nx][ny] == '1' && dist[nx][ny][1] == 0 && broken == 0) {
                    queue.add(new int[]{nx, ny, 1});
                    dist[nx][ny][1] = dist[x][y][0] + 1;
                }

                if (board[nx][ny] == '0' && dist[nx][ny][broken] == 0) {
                    queue.add(new int[]{nx, ny, broken});
                    dist[nx][ny][broken] = dist[x][y][broken] + 1;
                }
            }
        }

        System.out.println(-1);
    }
}
