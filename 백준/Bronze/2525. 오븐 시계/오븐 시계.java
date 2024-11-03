import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // 현재 시간
       int A = sc.nextInt();
       int B = sc.nextInt();

       // 요리에 필요한 시간
        int C = sc.nextInt();

       int min = A * 60 + B;
       int result = min + C;

       A = result / 60;
       B = result % 60;

       if (A > 23)
           A -= 24;

        System.out.println(A + " " + B);
    }
}
