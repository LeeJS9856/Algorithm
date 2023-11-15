import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
	static int N;
	static int[] sum;
	static int[] tmp;
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		sum = new int[N];
		tmp = new int[N];
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<i;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(i==1) sum[0] = num;
				else if(j==0) sum[0] = tmp[0] + num;
				else if(j==i-1) sum[j] = tmp[j-1] + num;
				else sum[j] = Math.max(tmp[j-1]+num, tmp[j]+num);
			}
			for(int j=0;j<i;j++) {
				tmp[j] = sum[j];
			}
		}
		int max = 0;
		for(int i=0;i<N;i++) {
			if(max<sum[i]) max = sum[i];
		}
		bw.write(max+"");
		bw.flush();
		bw.close();
		
	}
	
}