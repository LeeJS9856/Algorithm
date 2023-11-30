import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for(int i=N-1;i>=0;i--) {
			if(K==0) break;
			while(K>=A[i]) {
				K -= A[i];
				count++;
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}