import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
	static long[] seq;
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			seq = new long[N];
			if(N<=3) bw.write(1+"\n");
			else if(N<=5) bw.write(2+"\n");
			else bw.write(P(N)+"\n");
		}
		
		
		bw.flush();
		bw.close();
		
	}
	public static long P(int N) {
		seq[0] = 1;
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 2;
		seq[4] = 2;
		
		for(int i=5;i<N;i++) {
			seq[i] = seq[i-1] +seq[i-5];
		}
		return seq[N-1];
	}
}