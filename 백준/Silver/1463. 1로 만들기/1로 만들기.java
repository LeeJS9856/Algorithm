import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		int queueStack;
		int queueCount = 0;
		while(dp[N]==0) {
			if(N==1) break;
			
			queueStack = 0;
			if(count == 0) {
				queue.add(1);
				queueStack++;
			}
			else {
				while(queueCount>0) {
					int num = queue.poll();
					if(num*3<=N) {
						if(dp[num*3]==0) {
							queue.add(num*3);
							queueStack++;
							dp[num*3] = count;
						}
					}
					if(num*2<=N) {
						if(dp[num*2]==0) {
							queue.add(num*2);
							queueStack++;
							dp[num*2] = count;
						}
					}
					if(num+1<=N) {
						if(dp[num+1]==0) {
							queue.add(num+1);
							queueStack++;
							dp[num+1] = count;
						}
					}
					queueCount--;
					if(dp[N]!=0) break;
				}
			}
			queueCount = queueStack;
			count++;
		}
		if(N==1) bw.write(0+"");
		else bw.write(dp[N]+"");
		bw.flush();
		bw.close();
		
	}
}
	