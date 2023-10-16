import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A;
		A = scanner.nextInt();
	
		if(A%4!=0) {
			println("0");
		}
		else if(A%400==0) {
			println("1");
		}
		else if(A%100==0){
			println("0");
		}
		else {
			println("1");
		}
	}
	
	public static void println(String text) {
		System.out.println(text);
	}
}