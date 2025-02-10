import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++)
            q.add(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!q.isEmpty()) {
            for (int i = 1; i < K; i++)
                q.add(q.remove());
            sb.append(q.peek());

            q.remove();
            if (!q.isEmpty())
                sb.append(", ");
        }

        sb.append(">");

        bw.write(sb.toString());
        bw.close();
    }
}