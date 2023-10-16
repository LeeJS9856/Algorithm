import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x>0 && y>0) println(1);
		else if(x<0 && y>0) println(2);
		else if(x<0 && y<0) println(3);
		else if(x>0 && y<0) println(4);
	}
	
	public static void println(int text) {
		System.out.println(text);
	}
}