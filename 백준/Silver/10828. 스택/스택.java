import java.io.*;
import java.util.*;

public class Main {
    static int[] stack = new int[10000];
    static int index = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                push(x);
            } else if (command.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(empty()).append("\n");
            } else { // command.equals("top")
                sb.append(top()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }

    private static void push(int x) {
        stack[index++] = x;
    }

    private static int pop() {
        if (index == 0)
            return -1;
        return stack[--index];
    }

    private static int size() {
        return index;
    }

    private static int empty() {
        if (index == 0)
            return 1;
        return 0;
    }

    private static int top() {
        if (index == 0)
            return -1;
        return stack[index-1];
    }
}