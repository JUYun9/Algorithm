import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.nextLine();
		
		int i = in.nextInt();
		
		System.out.println(S.charAt(i-1));
	}
}