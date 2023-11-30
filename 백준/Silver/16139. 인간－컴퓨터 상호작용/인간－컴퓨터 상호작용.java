import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static char a = 'a';
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] S = br.readLine().split(""); 
		int[][] dp = new int[S.length][26]; //행 : A~Z , 열 : 알파벳 개수 합
		
		for(int i=0;i<S.length;i++) {
			int alpha = (int)S[i].charAt(0) - (int)a;
			for(int j=0;j<26;j++) {
				if(i==0) {
					if(j==alpha) dp[i][j] = 1;
				}
				else { 
					if(j==alpha) dp[i][j] = dp[i-1][j] + 1;
					else dp[i][j] = dp[i-1][j];
				}
			}
			
		}
		
		
		int q = Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int alpha = (int)st.nextToken().charAt(0) - (int)a;
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if(l==0) bw.write(dp[r][alpha]+"\n");
			else bw.write((dp[r][alpha] - dp[l-1][alpha])+"\n");
		}

		
		bw.flush();
		bw.close();
	}
}