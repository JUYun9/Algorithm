import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 2025-12-02
// 12:42 ~ 13:10

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            Long target = Long.valueOf(br.readLine());
            if (map.get(target) != null)
                map.put(target, map.get(target) + 1);
            else
                map.put(target, 1);
        }

        Long maxKey = 0L;
        int maxValue = Integer.MIN_VALUE;
        for (Long key: map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
            else if (value == maxValue) {
                if (maxKey > key) {
                    maxKey = key;
                    maxValue = value;
                }
            }
        }

        System.out.println(maxKey);

    }
}
