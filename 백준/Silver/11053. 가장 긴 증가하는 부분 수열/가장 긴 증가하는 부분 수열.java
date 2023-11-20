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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxValue = 0;
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
			
			if(dp[i] > maxValue) maxValue = dp[i];
		}
		bw.write(maxValue+"");
		bw.flush();
		bw.close();
		
	}
}