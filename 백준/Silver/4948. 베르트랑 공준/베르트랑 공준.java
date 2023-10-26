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

		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			int count=0;
			for(int i=n+1;i<=2*n;i++) {
				if(isPrime(i)) count++;
			}
			bw.write(count+"\n");
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