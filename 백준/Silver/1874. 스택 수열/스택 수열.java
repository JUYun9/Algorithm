import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean isPossible = true;
        while(N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            while (true) {
                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    sb.append("-").append("\n");
                    break;
                }
                stack.push(k++);
                sb.append("+").append("\n");

                if (num < k && stack.peek() != num) {
                    isPossible = false;
                    break;
                }
            }
        }

        if (isPossible)
            bw.write(sb.toString());
        else
            bw.write("NO");
        bw.close();
    }
}