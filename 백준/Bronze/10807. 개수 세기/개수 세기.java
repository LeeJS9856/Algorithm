import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String A = br.readLine();
		int[] B = new int[N];
		StringTokenizer st = new StringTokenizer(A);
		
		for(int i = 0; i<N ; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i<N ; i++ ) {
			if(B[i]==v) count++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}