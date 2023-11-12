import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
	static final int NUMBER = 15746;
	static long[] seq;
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		seq = new long[N];
		bw.write(binSeq(N)+"");
		bw.flush();
		bw.close();
		
	}
	public static long binSeq(int N) {
		seq[0] = 1;
		if(N!=1) seq[1] = 2;
		for(int i = 2;i<N;i++) {
			seq[i] = (seq[i-1] + seq[i-2])%NUMBER;
		}
		
		return seq[N-1];
		
	}
}