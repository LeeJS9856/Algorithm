import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int number = 666;
		int count = 0;
		while(true) {
			if(ifEnd(number)) {
				count++;
			}
			if(count==N) {
				System.out.println(number);
				break;
			}
			number++;
		}
	}
	
	public static boolean ifEnd(int number) {
		if(String.valueOf(number).contains("666")) return true;
		return false;
	}
}