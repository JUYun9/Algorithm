import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        //
        int k = Integer.parseInt(br.readLine());
        while (k-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0)
                deque.add(num);
            else
                deque.removeLast();
        }

        int result = 0;
        while (!deque.isEmpty())
            result += deque.poll();

        System.out.println(result);
    }
}
