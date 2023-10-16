import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A;
		A = scanner.nextInt();
	
		if(A>=90&&A<=100) {
			println("A");
		}
		else if(A>=80&&A<=89) {
			println("B");
		}
		else if(A>=70&&A<=79) {
			println("C");
		}
		else if(A>=60&&A<=69) {
			println("D");
		}
		else {
			println("F");
		}
		
	}
	
	public static void println(String text) {
		System.out.println(text);
	}
}