import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int t = Integer.parseInt(br.readLine());
            if (t != 0)
                stack.push(t);
            else
                stack.pop();
        }

        int sum = 0;
        for (int num: stack) {
            sum += num;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}