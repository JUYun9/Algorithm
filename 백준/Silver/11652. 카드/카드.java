import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Long, Integer> map = new HashMap<>();

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            Long num = Long.parseLong(br.readLine());

            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.put(num, map.get(num)+1);
        }

        Long maxKey = 0L;
        int maxValue = Integer.MIN_VALUE;
        for (Long key: map.keySet()) {
            int targetValue = map.get(key);
            if (targetValue > maxValue) {
                maxValue = targetValue;
                maxKey = key;
            } else if (targetValue == maxValue) {
                if (maxKey > key) {
                    maxKey = key;
                }
            }
        }

        System.out.println(maxKey);

    }
}
