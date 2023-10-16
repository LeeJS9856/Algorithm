import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		if(A!=B&&B!=C&&A!=C) {
			int most = A;
			if(A<B) {
				most = B;
			}
			if(most<C) {
				most = C;
			}
			System.out.println(most*100);
		}
		else if(A==B || B==C) {
			if(A==B&&B==C) System.out.println(10000+B*1000);
			else System.out.println(1000+B*100);
		}
		else System.out.println(1000+C*100);
	}
}