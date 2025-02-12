import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            deque.addLast(i);

        st = new StringTokenizer(br.readLine());

        int totalMove = 0;
        while (M-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int t: deque) {
                if (t == num)
                    break;
                count++;
            }

            if (count <= deque.size()/2) {
                while (deque.peekFirst() != num) {
                    deque.addLast(deque.removeFirst());
                    totalMove++;
                }
            } else {
                while (deque.peekFirst() != num) {
                    deque.addFirst(deque.removeLast());
                    totalMove++;
                }
            }
            deque.removeFirst();
        }

        bw.write(String.valueOf(totalMove));
        bw.close();
    }
}