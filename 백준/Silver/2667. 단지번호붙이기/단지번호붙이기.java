// 바킹독 BFS 문제집
// 2024-07-22 (화)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static char[][] board;
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];

        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        bfs(N);

    }

    private static void bfs(int size) {
        int count1 = 0; // 총 단지 수
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '1' && !visited[i][j]) {
                    q.add(new int[]{i, j});
                    count1++;
                    visited[i][j] = true;

                    int count2 = 1; // 각 단지내 집의 수
                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for (int dir = 0; dir < 4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];

                            if (nx < 0 || ny < 0 || nx >= size || ny >= size)
                                continue;
                            if (visited[nx][ny] || board[nx][ny] == '0')
                                continue;

                            count2++;
                            visited[nx][ny] = true;
                            q.add(new int[]{nx, ny});
                        }
                    }
                    priorityQueue.add(count2);
                }
            }
        }

        System.out.println(count1);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}