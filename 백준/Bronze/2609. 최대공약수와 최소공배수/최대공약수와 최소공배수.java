import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(num1, num2);
        System.out.println(gcd);

        int lcm = lcm(num1, num2);
        System.out.println(lcm);
    }

    // 최대공약수
    static int gcd(int x, int y) {
        while (true) {
            int remainder = x % y;
            if (remainder != 0) {
                x = y;
                y = remainder;
            }
            else
                return y;
        }
    }

    static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }
}