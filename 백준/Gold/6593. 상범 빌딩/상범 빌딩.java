import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static char[][][] board;
    private static int[][][] dist;

    private static int[] dx = {0, 1, 0, -1, 0, 0};
    private static int[] dy = {1, 0, -1, 0, 0, 0};
    private static int[] dz = {0, 0, 0, 0, 1, -1};

    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            queue.clear();
            
            StringTokenizer st = new StringTokenizer(br.readLine());

            int buildingHeight = Integer.parseInt(st.nextToken());
            int buildingRow = Integer.parseInt(st.nextToken());
            int buildingCol = Integer.parseInt(st.nextToken());
            if (buildingHeight == 0 && buildingRow == 0 && buildingCol == 0)
                return;

            board = new char[buildingRow][buildingCol][buildingHeight];
            dist = new int[buildingRow][buildingCol][buildingHeight];

            for (int i = 0; i < buildingHeight; i++) {
                for (int j = 0; j < buildingRow; j++) {
                    for (int k = 0; k < buildingCol; k++)
                        dist[j][k][i] = -1;
                }
            }

            for (int k = 0; k < buildingHeight; k++) {
                if (k > 0)
                    br.readLine();
                for (int i = 0; i < buildingRow; i++) {
                    String line = br.readLine();
                    for (int j = 0; j < buildingCol; j++) {
                        board[i][j][k] = line.charAt(j);
                        if (board[i][j][k] == 'S') {
                            queue.add(new int[]{i, j, k});
                            dist[i][j][k] = 0;
                        }
                    }
                }
            }

            bfs(buildingRow, buildingCol, buildingHeight);
            br.readLine();
        }
    }

    private static void bfs(int row, int col, int height) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int z = cur[2];
            for (int dir = 0; dir < 6; dir++) {
                if (board[x][y][z] == 'E') {
                    System.out.println("Escaped in " + dist[x][y][z] + " minute(s).");
                    return;
                }
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                int nz = z + dz[dir];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= row || ny >= col || nz >= height)
                    continue;
                if (dist[nx][ny][nz] >= 0 || board[nx][ny][nz] == '#')
                    continue;

                dist[nx][ny][nz] = dist[x][y][z] + 1;
                queue.add(new int[]{nx, ny, nz});
            }
        }

        System.out.println("Trapped!");
    }
}
