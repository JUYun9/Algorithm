import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[10];   // 1~9까지 필요함

        int num = Integer.parseInt(br.readLine());
        while (num > 0) {
            count[num%10]++;
            num /= 10;
        }

        int avg = (count[6]+count[9]+1) / 2;
        int ans = count[0];
        for (int i = 1; i < 10; i++) {
            if (i == 6 || i == 9)
                continue;
            ans = Math.max(ans, count[i]);
        }

        System.out.println(Math.max(ans, avg));
    }
}
