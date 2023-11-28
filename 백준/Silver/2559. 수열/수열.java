import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int sum[] = new int[N];
		int dp[] = new int[N-K+1];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int number = Integer.parseInt(st2.nextToken());
			if(i==0) sum[i] = number;
			else sum[i] = sum[i-1] + number;
		}
		int max = 0;
		for(int i=0;i<N-K+1;i++) {
			if(i==0) {
				dp[i] = sum[i+K-1];
				max = dp[i];
			}
			else dp[i] = sum[i+K-1] - sum[i-1];
			
			max = Math.max(max, dp[i]);
		}
		bw.write(max+"");
		bw.flush();
		bw.close();
	}
}