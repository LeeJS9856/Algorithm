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
		
		//N M K 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//보드판 입력
		int[][] dp = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String[] str2 = br.readLine().split("");
			for(int j=0;j<M;j++) {
				String chess = str2[j];
				int toggle = 0;
				//바꿔야하는 체스를 1로 표기
				if((i%2==1&&j%2==1)||(i%2==0&&j%2==0)) {
					if(chess.equals("W")) {
						toggle = 1;;
					}
				}
				else {
					if(chess.equals("B")) {
						toggle = 1;
					}
				}
				
				//표기한 체스판을 구간합의 dp로 표기
				if(i==0&&j==0) dp[i][j] = toggle;
				else if(i==0&&j!=0) dp[i][j] = dp[i][j-1] + toggle;
				else if(i!=0&&j==0) dp[i][j] = dp[i-1][j] + toggle;
				else dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + toggle;

			}
		}
		
		
		
		
		//K X K의 범위에서 (table 합의 최소값)과 ((K*K)-(table합의 최댓값)) 중 작은값이 구해야 하는 값
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=0;i<=N-K;i++) {
			for(int j=0;j<=M-K;j++) {
				if(i==0&&j==0) {
					sum = dp[i+K-1][j+K-1];
				}
				
				else if(i==0&&j!=0) {
					sum = dp[i+K-1][j+K-1] - dp[i+K-1][j-1];
				}
				else if(i!=0&&j==0) {
					sum = dp[i+K-1][j+K-1] - dp[i-1][j+K-1];
				}
				else {
					sum = dp[i+K-1][j+K-1] - dp[i+K-1][j-1] - dp[i-1][j+K-1] + dp[i-1][j-1];
				}
				if(i==0&&j==0) {
					min = sum;
				}
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
		}
		bw.write(Math.min(min, K*K-max)+" ");
		bw.flush();
		bw.close();
	}
}