// 바킹독 BFS 문제집
// 2025-07-19 (토)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int[] dx = {0,  0,  1, -1,  0,  0};
    private static int[] dy = {1, -1,  0,  0,  0,  0};
    private static int[] dz = {0,  0,  0,  0,  1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row      = Integer.parseInt(st.nextToken()); // m: 열 수
        int col      = Integer.parseInt(st.nextToken()); // n: 행 수
        int boxCount = Integer.parseInt(st.nextToken()); // h: 상자(층) 수

        int[][][] board = new int[boxCount][col][row];
        int[][][] dist  = new int[boxCount][col][row];
        Queue<int[]> Q = new LinkedList<>();

        // 1) 입력과 동시에 익은 토마토는 큐에, 안 익은 토마토는 dist=-1로 표시
        for (int k = 0; k < boxCount; k++) {
            for (int i = 0; i < col; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < row; j++) {
                    int tmp = Integer.parseInt(st.nextToken());
                    board[k][i][j] = tmp;
                    if (tmp == 1) {
                        Q.offer(new int[]{k, i, j});
                    }
                    if (tmp == 0) {
                        dist[k][i][j] = -1;
                    }
                }
            }
        }

        // 2) 한 번만 전체 BFS 실행
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int z = cur[0], x = cur[1], y = cur[2];

            for (int d = 0; d < 6; d++) {
                int nz = z + dz[d];
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 경계 검사
                if (nz < 0 || nz >= boxCount ||
                    nx < 0 || nx >= col     ||
                    ny < 0 || ny >= row) {
                    continue;
                }
                // 이미 익었거나 빈 칸은 건너뛰기 (dist ≥ 0)
                if (dist[nz][nx][ny] >= 0) {
                    continue;
                }

                dist[nz][nx][ny] = dist[z][x][y] + 1;
                Q.offer(new int[]{nz, nx, ny});
            }
        }

        // 3) 결과 판정: 익지 못한 토마토( dist == -1 )가 있으면 -1, 아니면 최대값 출력
        int ans = 0;
        for (int k = 0; k < boxCount; k++) {
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if (dist[k][i][j] == -1) {
                        System.out.println(-1);
                        return;
                    }
                    ans = Math.max(ans, dist[k][i][j]);
                }
            }
        }

        System.out.println(ans);
    }
}
