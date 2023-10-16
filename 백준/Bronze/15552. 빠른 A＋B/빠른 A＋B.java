import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] arg) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		int[] A = new int[T];
		int[] B = new int[T];
		
		for(int i=0;i<T;i++) {
			String ab = bf.readLine();
			StringTokenizer st = new StringTokenizer(ab);
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<T;i++) {
			bw.write(A[i]+B[i]+"\n");
		}
		bw.flush();
		bw.close();
		
	}
}