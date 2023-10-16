import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int X, N, a, b, sum=0;
		
		X = scanner.nextInt();
		N = scanner.nextInt();
		
		for(int i=0;i<N;i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			sum = sum + (a*b);
		}
		
		if(sum==X) System.out.println("Yes");
		else System.out.println("No");
		
	}
}