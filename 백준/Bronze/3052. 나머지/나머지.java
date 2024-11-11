import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int[] count = new int[11];
        for (int i = 0; i < 10; i++) {
            A = sc.nextInt();
            count[i] = A % 42;
        }

        for (int j = 9; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (count[i] > count[i + 1]) {
                    int tmp = count[i];
                    count[i] = count[i + 1];
                    count[i + 1] = tmp;
                }
            }
        }

        int cnt = 1;
        for (int i = 0; i < 9; i++) {
            if (count[i] != count[i + 1])
                cnt++;
        }

        System.out.println(cnt);
    }
}
