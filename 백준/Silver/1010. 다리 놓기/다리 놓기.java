import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			BigInteger res = pac(Math.max(N, M)).divide(pac(Math.min(N, M)));
			res = res.divide(pac(Math.max(N, M)-Math.min(N, M)));
			bw.write(res+"\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static BigInteger pac(int num) {
		BigInteger one = BigInteger.ONE;
		BigInteger number = new BigInteger(String.valueOf(num));
		
		if(num==1||num==0) return one;
		else return number.multiply(pac(num-1));
	}
}