import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < count; i++) {
			String text = in.nextLine();
			char first = text.charAt(0);
			char end = text.charAt(text.length()-1);
			
			System.out.println(first + "" + end);
		}
	}
	
}
