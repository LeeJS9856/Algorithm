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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] dp = new int[N+1];
		int[] countNum = new int[M];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		dp[0] = 0;
		countNum[0] = 1;
		for(int i=1;i<=N;i++) {
			int A = Integer.parseInt(st2.nextToken());
			dp[i] = ( dp[i-1] + A ) % M;
			countNum[dp[i]] += 1;
		}
		
		long count = 0;
		for(long i : countNum) {
			count += i*(i-1)/2;
		}
		
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}