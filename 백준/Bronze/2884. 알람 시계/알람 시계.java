import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int H, M;
		H = scanner.nextInt();
		M = scanner.nextInt();
		
		if(M>=45) {
			System.out.println(H+" "+(M-45));
		}
		else if(H>0 && M<45) {
			System.out.println((H-1)+" "+(M+15));
		}
		else if(H==0 && M<45) {
			System.out.println(23+" "+(M+15));
		}
	}
}