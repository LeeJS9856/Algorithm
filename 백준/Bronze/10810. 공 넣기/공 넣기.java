import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String NM = br.readLine();
		StringTokenizer st = new StringTokenizer(NM);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N];
		Arrays.fill(basket,0);
		
		for (int z=0;z<M;z++) {
			String ijk = br.readLine();
			StringTokenizer st2 = new StringTokenizer(ijk);
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			int k = Integer.parseInt(st2.nextToken());
			
			for(int x = i-1;x<=j-1;x++) {
				basket[x] = k;
			}
		}
		
		for(int z=0;z<N;z++) {
			bw.write(basket[z] + " ");
		}
		bw.flush();
		bw.close();
	}
}