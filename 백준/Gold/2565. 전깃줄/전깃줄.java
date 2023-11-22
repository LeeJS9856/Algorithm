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
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> mp = new HashMap<>();
		int[] list = new int[N];
		int[] dp = new int[N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			mp.put(A, B);
		}
		List<Integer> keySet = new ArrayList<>(mp.keySet());
		Collections.sort(keySet);
		int n = 0;
		for(int key : keySet) {
			list[n] = mp.get(key);
			n++;
		}
		
		int max = 0;
		for(int i=0;i<N;i++) {
			if(i==0) dp[0] = 1;
			else {
				dp[i] = 1;
				for(int j=0;j<i;j++) {
					if(list[j] < list[i]) {
						dp[i] = Math.max(dp[j]+1, dp[i]);
					}
				}
			}
			max = Math.max(max, dp[i]);
		}

		bw.write(N-max+"");
		
		bw.flush();
		bw.close();
		
	}
}