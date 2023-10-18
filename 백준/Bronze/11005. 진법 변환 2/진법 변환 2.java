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
		
		String NB = br.readLine();
		StringTokenizer st = new StringTokenizer(NB);
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int res=0;
		
		int value = N;
		int rest = N;
		List<Character> digit = new ArrayList<>();
		do{
			rest = value % B;
			value = value / B;
			digit.add(intToAlpha(rest));
			if(value==0) break;
		}while(true);
		
		for(int i=digit.size()-1;i>=0;i--) {
			bw.write(digit.get(i));
		}
		bw.flush();
		bw.close();
	}
	
	public static char intToAlpha(int number) {
		char alpha;
		if(number>=10&&number<=35) {
			int alphaNumber = (int)"A".charAt(0)+number-10;
			alpha = (char)alphaNumber;
		}
		else {
			int newNumber = number + (int)"0".charAt(0);
			alpha = (char)newNumber;
		}
		return alpha;
	}
}