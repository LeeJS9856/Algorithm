import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A, B;
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A>B) {
			println(">");
		}
		else if(A<B) {
			println("<");
		}
		else if(A==B) {
			println("==");
		}
	}
	
	public static void println(String text) {
		System.out.println(text);
	}
	public static void println(int text) {
		System.out.println(text);
	}
}