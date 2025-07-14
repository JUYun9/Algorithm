import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 시작
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] board = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 입력 끝

        int biggestSize = 0;
        int count = 0;

        boolean[][] visited = new boolean[row][col];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 해당 지역을 방문하지 않았고, 값이 1일 때
                if (!visited[i][j] && board[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                    count++;
                }

                int area = 0;
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    area++;
                    
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur[0] + dx[dir];
                        int ny = cur[1] + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                            continue;
                        if (visited[nx][ny] || board[nx][ny] == 0)
                            continue;

                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        
                    }
                }

                biggestSize = Math.max(biggestSize, area);
            }
        }

        System.out.println(count);
        System.out.println(biggestSize);

    }
}
