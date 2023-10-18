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
		
		String NB = br.readLine();
		StringTokenizer st = new StringTokenizer(NB);
		String[] N = st.nextToken().split("");
		int B = Integer.parseInt(st.nextToken());
		int res=0;
		
		for(int i=0;i<N.length;i++) {
			res = res + alphaToInt(N[i])*square(B,N.length-1-i);
			
		}
		bw.write(res+"\n");
		bw.flush();
		bw.close();
	}
	
	public static int alphaToInt(String alpha) {
		int number = 0;
		if((int)alpha.charAt(0)>=(int)"A".charAt(0)&&(int)alpha.charAt(0)<=(int)"Z".charAt(0)) {
			number = (int)alpha.charAt(0)-(int)"A".charAt(0)+10;
		}
		else {
			number = Integer.parseInt(alpha);
		}
		return number;
	}
	
	public static int square(int base, int power) {
		if(power == 0) {
			return 1;
		}
		else if(power != 1) {
			return square(base,power-1)*base;
		}
		
		return base;
	}
}