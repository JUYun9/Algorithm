import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();

       int result;
       // 같은 눈 3개
       if (A == B && B == C)
           result = 10000 + A * 1000;
       // 같은 눈 2개
       else if (A == B && A != C)
           result = 1000 + A * 100;
       else if (A == C && A != B)
           result = 1000 + A * 100;
       else if (B == C && C != A)
           result = 1000 + B * 100;
       else {
           int max = C;
           if (A > max)
               max = A;
           if (B > max)
               max = B;
           result = max * 100;
       }

        System.out.println(result);
    }
}
