import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		
		println(a+b);
		println(a-b);
		println(a*b);
		println(a/b);
		println(a%b);
	}
	
	public static void println(int text) {
		System.out.println(text);
	}
	
}