import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int totalQuantity = sc.nextInt();
        int result = 0;
        for (int i = 0; i < totalQuantity; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            result += price * quantity;
        }

        if (totalPrice == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
