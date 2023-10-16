import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A,B,C;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		println((A+B)%C);
		println(((A%C)+(B%C))%C);
		println((A*B)%C);
		println(((A%C)*(B%C))%C);
	}
	
	public static void println(int text) {
		System.out.println(text);
	}
}