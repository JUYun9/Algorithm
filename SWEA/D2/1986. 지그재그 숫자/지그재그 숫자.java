import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int num = Integer.parseInt(br.readLine());

            int sum = 0;
            boolean isEven = false;
            for (int j = 1; j <= num; j++) {
                if (isEven)
                    sum -= j;
                else
                    sum += j;
                isEven = !(isEven);
            }

            System.out.println("#" + i + " " + sum);
        }
    }
}