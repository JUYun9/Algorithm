import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];

        // 초기값 설정
        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + 1;
            if (i % 2 == 0)
                arr[i] = Math.min(arr[i/2]+1, arr[i]);

            if (i % 3 == 0)
                arr[i] = Math.min(arr[i/3]+1, arr[i]);
        }

        System.out.println(arr[n]);
    }
}