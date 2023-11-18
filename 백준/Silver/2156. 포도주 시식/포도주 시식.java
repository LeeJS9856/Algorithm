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
		int[] max = new int[N];
		int[] tmp = new int[N];
		
		for(int i=0;i<N;i++) {
			int glass = Integer.parseInt(br.readLine());
			if(i==0) max[0] = glass;
			else if(i==1) {
				tmp[1] = glass;
				max[1] = max[0] + glass;
			
			}
			else {
				tmp[i] = max[i-2] + glass;
				max[i] = Math.max(tmp[i], Math.max(max[i-1], tmp[i-1]+glass));
			}
		}
		bw.write(max[N-1]+"");

		bw.flush();
		bw.close();
		
	}
}