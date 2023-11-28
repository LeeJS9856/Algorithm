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
		int M = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int number = Integer.parseInt(st2.nextToken());
			if(i==0) dp[i] = number;
			else dp[i] = dp[i-1] + number;
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st3.nextToken())-2;
			int end = Integer.parseInt(st3.nextToken())-1;
			
			if(start>=0) bw.write(dp[end]-dp[start]+"\n");
			else bw.write(dp[end]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
	