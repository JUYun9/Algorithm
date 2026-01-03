import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int target = Integer.parseInt(st.nextToken());
            set.add(target);
        }

        int num2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num2; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (set.contains(target))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        System.out.println(sb.toString());
    }
}
