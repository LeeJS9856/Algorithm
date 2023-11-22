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
		String s1[] = br.readLine().split("");
		String s2[] = br.readLine().split("");
		int[][] dp = new int[s1.length][s2.length];

		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				dp[i][j]=0; 
				
				
				if(i==0||j==0) {
					if(s1[i].equals(s2[j])) {
						dp[i][j] = 1;
					}
					else if(i==0&&j!=0) dp[0][j] = dp[0][j-1];
					else if(i!=0&&j==0) dp[i][0] = dp[i-1][0];
				}
				else if(s1[i].equals(s2[j])) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
			}

		}
		bw.write(dp[s1.length-1][s2.length-1]+"");
		bw.flush();
		bw.close();
		
	}
}