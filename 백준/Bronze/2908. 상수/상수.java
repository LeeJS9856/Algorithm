import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = br.readLine();
		StringTokenizer st = new StringTokenizer(A);
		String[] numberA = st.nextToken().split("");
		String[] numberB = st.nextToken().split("");
		
		if(changeInt(numberA)>changeInt(numberB)) {
			bw.write(changeInt(numberA)+"\n");
		}
		else {
			bw.write(changeInt(numberB)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int changeInt(String[] number) {
		int newNumber = 100*Integer.parseInt(number[2])+10*Integer.parseInt(number[1])+Integer.parseInt(number[0]);
		return newNumber;
	}
}