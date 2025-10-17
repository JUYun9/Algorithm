import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num =  Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int target =  Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int ans = 0;

        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int sum = arr[start]+arr[end];
            if (sum == target) {
                ans++;
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else
                start++;
        }

        System.out.println(ans);
    }
}
