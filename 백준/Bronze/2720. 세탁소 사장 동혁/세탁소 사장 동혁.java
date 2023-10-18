import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int C = Integer.parseInt(br.readLine());
			int rest = C;
			int Quater = C / 25;
			rest = C%25;
			int Dime = rest / 10;
			rest = rest%10;
			int Nickel = rest / 5;
			rest = rest%5;
			int Penny = rest / 1;
			
			bw.write(Quater + " " + Dime + " " + Nickel + " " + Penny + "\n");
		}
		bw.flush();
		bw.close();
		
		
	}
}