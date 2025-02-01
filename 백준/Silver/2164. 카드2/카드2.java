import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++)
            queue.add(i);
        
        while (queue.size() > 1) {
            queue.remove();
            queue.add(queue.remove());
        }
        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
    }
}