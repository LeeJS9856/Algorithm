import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] W = new int[N];
		int[] V = new int[N];
		int[] dp = new int[K+1];
		int[] tmpDp = new int[K+1];
		for(int i=0;i<K+1;i++) {
			dp[i] = 0;
		}
		for(int i=0;i<N;i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st2.nextToken());
			V[i] = Integer.parseInt(st2.nextToken());
			
			if(W[i]<=K) {
				for(int j=0;j<K+1;j++) {
					if(j==W[i]&&dp[j]==0) {
						tmpDp[j] = V[i];
					}
					else if(j==W[i]&&dp[j]!=0) {
						tmpDp[j] = Math.max(V[i], dp[j]);
						if(j+W[i]<=K) {
							tmpDp[j+W[i]] = Math.max(dp[j] + V[i], dp[j+W[i]]);
						}
					}
					else if(dp[j]!=0&&j!=W[i]) {
						if(j+W[i]<=K) {
							tmpDp[j+W[i]] = Math.max(dp[j] + V[i], dp[j+W[i]]);
						}
					}
				}
			}
			for(int j=0;j<K+1;j++) {
				dp[j] = tmpDp[j];
			}
		}
		int max = 0;
		for(int i : dp) {
			max = Math.max(max, i);
		}
		bw.write(max+"");
		
		bw.flush();
		bw.close();
		
	}
}