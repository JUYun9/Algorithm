import java.io.*;
import java.util.*;

public class Main {
    static int[] deque = new int[100001];
    static int head = 5000;
    static int tail = 5000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                push_back(num);
            } else if (str.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                push_front(num);
            } else if (str.equals("pop_front")) {
                sb.append(pop_front()).append("\n");
            } else if (str.equals("pop_back")) {
              sb.append(pop_back()).append("\n");
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

    private static void push_front(int num) {
        deque[--head] = num;
    }

    private static void push_back(int num) {
        deque[tail++] = num;
    }

    private static int pop_front() {
        if (tail == head)
            return -1;
        return deque[head++];
    }

    private static int pop_back() {
        if (tail == head)
            return -1;
        return deque[--tail];
    }

    private static int size() {
        return tail - head;
    }

    private static int empty() {
        if (tail == head)
            return 1;
        return 0;
    }

    private static int front() {
        if (tail == head)
            return -1;
        return deque[head];
    }

    private static int back() {
        if (tail == head)
            return -1;
        return deque[tail-1];
    }
}