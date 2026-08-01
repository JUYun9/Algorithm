//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 2; int b = 3; int c = 5;
        int d = 7; int e = 11;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int[] result = new int[5];

            int num = Integer.parseInt(br.readLine());
            while (num%e == 0) {
                num /= e;
                result[4]++;
            }

            while (num%d == 0) {
                num /= d;
                result[3]++;
            }

            while (num%c == 0) {
                num /= c;
                result[2]++;
            }

            while (num%b == 0) {
                num /= b;
                result[1]++;
            }

            while (num%a == 0) {
                num /= a;
                result[0]++;
            }

            System.out.println("#" + i + " " + result[0] + " " +
                    result[1] + " " + result[2] + " " +
                    result[3] + " " + result[4]);
        }
    }
}