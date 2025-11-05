import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCase; i++) {
            String str = br.readLine();

            int ans = 0;

            char prev = '0';
            for (int j = 0; j < str.length(); j++) {
                char target = str.charAt(j);
                if (target != prev) {
                    prev = target;
                    ans++;
                }
            }

            System.out.println("#" + i + " " + ans);
        }
    }
}