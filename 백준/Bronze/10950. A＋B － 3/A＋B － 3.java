import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a, b;
        for (int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}
