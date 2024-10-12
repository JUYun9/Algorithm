
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		scanner.nextLine();
		
		String b = scanner.nextLine();
		
		int b0 = b.charAt(2) - '0';
		int b1 = b.charAt(1) - '0';
		int b2 = b.charAt(0) - '0';
		
		int result1 = a * b0;
		int result2 = a * b1;
		int result3 = a * b2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1 + 10*result2 + 100*result3);
	}

}

