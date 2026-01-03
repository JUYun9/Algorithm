import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map1 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int target = Integer.parseInt(st.nextToken());
            if (!map1.containsKey(target))
                map1.put(target, 1);
        }

        int num2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[num2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num2; i++)
            arr2[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num2; i++) {
            if (map1.containsKey(arr2[i]))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }


        System.out.println(sb.toString());
    }
}
