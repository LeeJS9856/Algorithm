import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C, D, E, F;
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		C = A * (B%10);
		D = A * (B/10%10);
		E = A * (B/100);
		F = A*B;
		
		System.out.println(C+"\n"+D+"\n"+E+"\n"+F);
	}

}