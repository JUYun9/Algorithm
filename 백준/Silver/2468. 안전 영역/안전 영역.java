import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static int[][] board;
    private static int maxArea;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        int maxHeight = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] > maxHeight)
                    maxHeight = board[i][j];
            }
        }

        while (maxHeight-- > 0) {
            int result = bfs(N, maxHeight);
            if (result > maxArea)
                maxArea = result;
        }

        System.out.println(maxArea);
    }

    private static int bfs(int size, int height) {
        int area = 0;
        boolean[][] visited = new boolean[size][size];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] <= height || visited[i][j])
                    continue;

                visited[i][j] = true;

                queue.add(new int[]{i, j});
                area++;
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= size || ny >= size)
                            continue;
                        if (visited[nx][ny] || board[nx][ny] <= height) {
                            visited[nx][ny] = true;
                            continue;
                        }

                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        return area;
    }
}
