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
		int[] RGB = new int[3];
		int[] sum = new int[3];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int G = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(i==0) {
				sum[0] = R;
				sum[1] = G;
				sum[2] = B;
			}
			else {
				sum[0] = Math.min(R+RGB[1], R+RGB[2]);
				sum[1] = Math.min(G+RGB[0], G+RGB[2]);
				sum[2] = Math.min(B+RGB[0], B+RGB[1]);
			}
			
			for(int j=0;j<3;j++) {
				RGB[j] = sum[j];
			}
		}
		bw.write(Math.min(sum[0], Math.min(sum[1], sum[2]))+"");
		bw.flush();
		bw.close();
		
	}
	
}