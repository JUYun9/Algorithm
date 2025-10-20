import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        stack.push(new int[]{0, 100000001});
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= num; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (stack.peek()[1] >= target) {
                stack.push(new int[]{i, target});
                sb.append(i-1).append(" ");
            } else {
                stack.pop();
                while (stack.peek()[1] < target) {
                    stack.pop();
                }
                sb.append(stack.peek()[0]).append(" ");
                stack.push(new int[]{i, target});
            }
        }

        System.out.println(sb.toString());
    }
}
