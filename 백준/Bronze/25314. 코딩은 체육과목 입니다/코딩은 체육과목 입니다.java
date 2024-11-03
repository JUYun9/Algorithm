import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String result = "";

        while(N >= 4) {
            result += "long ";
            N -= 4;
        }
        System.out.println(result + "int");
    }
}
