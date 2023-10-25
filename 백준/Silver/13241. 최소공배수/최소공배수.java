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
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		long res = (long)A * (long)B / minDivisor(A,B);	
		
		bw.write(res+"\n");
		
		bw.flush();
		bw.close();
		
	}
	
	public static int minDivisor(int numberA, int numberB) {
		int div = 1;
		for(int i=2;i<=Math.min(numberA, numberB);i++) {
			if(numberA%i==0 && numberB%i==0) {
				div = i;
			}
		}
		return div;
	}

}
