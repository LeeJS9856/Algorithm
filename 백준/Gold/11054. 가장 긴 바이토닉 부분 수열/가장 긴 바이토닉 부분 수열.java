import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		int[] dp = new int[N];
		int[] dpRv = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxDp = 0;
		for(int i=0;i<N;i++) {
			int number = Integer.parseInt(st.nextToken());
			list[i] = number;
			if(i==0) {
				dp[0] = 1;
			}
			else  {
				dp[i] = 1;
				for(int j=0;j<i;j++) {
					if(list[j]<number) {
						dp[i] = Math.max(dp[j]+1, dp[i]);
					}
				}
			}
		}
		for(int i=0;i<N;i++) {
			if(i==0) {
				dpRv[N-1] = 1;
			}
			else  {
				dpRv[N-1-i] = 1;
				for(int j=N-1;j>N-i-1;j--) {
					if(list[j]<list[N-1-i]) {
						dpRv[N-1-i] = Math.max(dpRv[j]+1, dpRv[N-1-i]);
					}
				}
			}
		}
		for(int i=0;i<N;i++) {
			maxDp = Math.max(maxDp, dp[i]+dpRv[i]);
		}
		bw.write(maxDp-1+"");
		bw.flush();
		bw.close();
		
	}
}