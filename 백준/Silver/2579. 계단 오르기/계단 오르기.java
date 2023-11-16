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
		int[] tmp = new int[N];
		int[] max = new int[N];
		for(int i=0;i<N;i++) {
			int score = Integer.parseInt(br.readLine());
			if(i==0) {
				tmp[0] = score;
				max[0] = tmp[0];
				
			}
			else if(i==1) {
				tmp[1] = score;
				max[1] = tmp[0] + score;
			}
			else {
				tmp[i] = max[i-2] + score;
				max[i] = Math.max(tmp[i-1]+score, tmp[i]);
			}
		}
		bw.write(max[N-1]+"");
		bw.flush();
		bw.close();
		
	}
	
}