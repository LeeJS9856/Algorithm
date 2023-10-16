import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int n, sum=0;
		n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}