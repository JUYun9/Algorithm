import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        long[] nums = new long[testCase];

        int k = 0;
        while (testCase-- > 0) {
            long target = Long.parseLong(br.readLine());
            nums[k++] = target;
        }

        Arrays.sort(nums);

        int cnt = 1;
        int maxCnt = 1;
        long minNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                cnt++;
            } else {
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    minNumber = nums[i-1];
                } else if (cnt == maxCnt) {
                    if (minNumber > nums[i-1]) {
                        minNumber = nums[i-1];
                        maxCnt = cnt;
                    }
                }

                cnt = 1;
            }
        }

        if (cnt > maxCnt)
            minNumber = nums[nums.length-1];

        System.out.println(minNumber);

    }
}
