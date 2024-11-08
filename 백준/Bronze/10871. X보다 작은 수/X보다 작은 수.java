import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        int[] newArr = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < X) {
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++)
            System.out.print(newArr[i] + " ");
    }
}
