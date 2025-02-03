import java.io.*;
import java.util.*;

public class Main {
    static int[] queue;
    static int start = 0;
    static int end = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                push(num);
            } else if (str.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (str.equals("front")) {
                sb.append(front()).append("\n");
            } else if (str.equals("back")) {
                sb.append(back()).append("\n");
            } else if (str.equals("size")) {
                sb.append(size()).append("\n");
            } else {
                sb.append(empty()).append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    private static void push(int num) {
        queue[end++] = num;
    }

    private static int pop() {
        if (start == end)
            return -1;
        else
            return queue[start++];
    }

    private static int size() {
        return end - start;
    }

    private static int empty() {
        if (end - start == 0)
            return 1;
        else
            return 0;
    }

    private static int front() {
        if (end - start == 0)
            return -1;
        else
            return queue[start];
    }

    private static int back() {
        if (end - start == 0)
            return -1;
        else
            return queue[end-1];
    }
}
