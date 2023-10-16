import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		int addH, addM;
		addH = C/60;
		addM = C%60;
		
		int newA, newB;
		newA = A+addH;
		newB = B+addM;
		
		if(newB>59) {
			newA++;
			newB = newB-60;
		}
		if(newA>23) {
			newA = newA-24;
		}
		
		System.out.println(newA+" "+newB);
	}
}