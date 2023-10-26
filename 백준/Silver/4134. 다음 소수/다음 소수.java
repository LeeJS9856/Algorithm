import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long T = Long.parseLong(br.readLine());
		for(long i=0;i<T;i++) {
			long n = Long.parseLong(br.readLine());
			while(!isPrime(n)) n++;
			bw.write(n+"\n");
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