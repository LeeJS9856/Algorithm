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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M;i<=N;i++) {
			if(isPrime(i)) bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static boolean isPrime(long number) {
		if(number==0||number==1) return false;
		for(long i=2;i<=Math.sqrt((double)number);i++) {
			if(number%i==0) return false;
		}
		return true;
	}
}