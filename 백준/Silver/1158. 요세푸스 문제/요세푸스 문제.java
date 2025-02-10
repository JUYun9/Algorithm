import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= num; i++)
            list.add(i);

        int k = Integer.parseInt(st.nextToken());

        while (num-- > 0) {
            int count = k;
            while (count != 1) {
                list.add(list.pop());
                count--;
            }

            int element = list.remove();

            sb.append(element);
            if (num == 0)
                sb.append(">");
            else
                sb.append(", ");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}