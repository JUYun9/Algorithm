import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        while (num-- > 0) {
            int target = Integer.parseInt(st.nextToken());

            map.put(target, map.getOrDefault(target, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        while (m-- > 0) {
            int target = Integer.parseInt(st.nextToken());

            int result = map.getOrDefault(target, 0);

            sb.append(result).append(" ");
        }

        System.out.println(sb.toString());
    }
}
